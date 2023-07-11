package org.eclipse.m2m.atl.bpmnplvar2pnplvar.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.bpmnplvar2pnplvar.files.Bpmnplvar2pnplvar;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;

public class TransformVarHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ArrayList<IFile> files = new ArrayList<IFile>();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object[] filesSelected = ((IStructuredSelection) selection).toArray();
			// if there is only one input file, we cant use this plugin
			if (filesSelected.length != 1) {
				MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
						"More than one file selected", "This option must be used with one file.");
				return false;
			}
			for (Object f : filesSelected) {
				files.add(Platform.getAdapterManager().getAdapter(f, IFile.class));
				if (files.get(files.size() - 1) == null) {
					files.remove(files.size() - 1);
					if (f instanceof IAdaptable)
						files.add(((IAdaptable) f).getAdapter(IFile.class));
				}
			}
		}
		try {
			
			// PASO 1
			URL asmURL;
			Bundle bundle = Platform.getBundle("org.eclipse.m2m.atl.bpmnplvar2pnplvar"); //$NON-NLS-1$
			asmURL = bundle.getEntry("bpmnplvar2pnplvar.asm");
			
			IInjector injector = CoreService.getInjector("EMF"); //$NON-NLS-1$
			IExtractor extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$			

			
			// PASO 2
			
			ModelFactory factory = CoreService.getModelFactory("EMF"); //$NON-NLS-1$

			// Metamodels
//			IReferenceModel bpmnMetamodel = factory.newReferenceModel();
//			injector.inject(bpmnMetamodel, "http://www.example.org/bpmn"); //$NON-NLS-1$
			IReferenceModel pnsMetamodel = factory.newReferenceModel();
			injector.inject(pnsMetamodel, "http://www.petrinets.org/");
			IReferenceModel pnsVarMetamodel = factory.newReferenceModel();
			injector.inject(pnsVarMetamodel, "/PNPL_variability/model/pnpl_variability");
			IReferenceModel bpmnVarMetamodel = factory.newReferenceModel();
			injector.inject(bpmnVarMetamodel, "http://www.example.org/bpmnpl_variability");
			IReferenceModel bpmnMetamodel = factory.newReferenceModel();
			injector.inject(bpmnMetamodel, "http://www.example.org/bpmn"); 

			// Getting launcher
			ILauncher launcher = null;
			launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
			launcher.initialize(Collections.<String, Object> emptyMap());

			// Creating models
			IModel bpmnVarModel = factory.newModel(bpmnVarMetamodel);
			IModel bpmnModel = factory.newModel(bpmnMetamodel);
			IModel pnsModel = factory.newModel(pnsMetamodel);
			IModel pnsVarModel = factory.newModel(pnsVarMetamodel);
			
			// Loading existing model
			System.out.println(files.get(0).getFullPath().toString());
			injector.inject(bpmnVarModel, files.get(0).getFullPath().toString());
			injector.inject(pnsModel, files.get(0).getFullPath().toString().replace(".bpmnpl_variability", ".petrinets"));
			injector.inject(bpmnModel, files.get(0).getFullPath().toString().replace(".bpmnpl_variability", ".bpmn"));

			// Launching
			launcher.addInModel(pnsModel, "INPN", "pns"); //$NON-NLS-1$ //$NON-NLS-2$
			launcher.addInModel(bpmnVarModel, "INVar", "bpmnplVariability"); //$NON-NLS-1$ //$NON-NLS-2$
			launcher.addInModel(bpmnModel, "INBPMN", "bpmn"); //$NON-NLS-1$ //$NON-NLS-2$
			launcher.addOutModel(pnsVarModel, "OUTVar", "pnplVariability"); //$NON-NLS-1$ //$NON-NLS-2$
			
			launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
					.<String, Object> emptyMap(), (Object[]) getModulesList());
//			launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
//					.<String, Object> emptyMap(), asmURL.openStream());
			// Saving model
			//System.out.println( files.get(0).getFullPath().toString().split(".")[0]);
			extractor.extract(pnsVarModel, files.get(0).getFullPath().toString().replace(".bpmnpl_variability", ".vrb"));

			// Refresh workspace
			files.get(0).getParent().refreshLocal(IProject.DEPTH_INFINITE, null);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	protected InputStream[] getModulesList() throws IOException {
		Properties properties = new Properties();
		properties.load(getFileURL("Bpmnplvar2pnplvar.properties").openStream());
		InputStream[] modules = null;
		String modulesList = properties.getProperty("Bpmnplvar2pnplvar.modules");
		if (modulesList != null) {
			System.out.println(modulesList);
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}
	
	protected URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = Bpmnplvar2pnplvar.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Bpmnplvar2pnplvar.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	
	public boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
