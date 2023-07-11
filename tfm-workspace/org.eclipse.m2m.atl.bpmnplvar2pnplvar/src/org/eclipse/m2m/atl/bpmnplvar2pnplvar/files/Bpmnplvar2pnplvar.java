/*******************************************************************************
 * Copyright (c) 2010, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.atl.bpmnplvar2pnplvar.files;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

/**
 * Entry point of the 'Bpmnplvar2pnplvar' transformation module.
 */
public class Bpmnplvar2pnplvar {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	/**
	 * The INPN model.
	 * @generated
	 */
	protected IModel inpnModel;	
	
	/**
	 * The INVar model.
	 * @generated
	 */
	protected IModel invarModel;	
	
	/**
	 * The INBPMN model.
	 * @generated
	 */
	protected IModel inbpmnModel;

	/**
	 * The OUTVar model.
	 * @generated
	 */
	protected IModel outvarModel;	
		
	/**
	 * The main method.
	 * 
	 * @param args
	 *            are the arguments
	 * @generated
	 */
	public static void main(String[] args) {
		try {
			if (args.length < 4) {
				System.out.println("Arguments not valid : {INPN_model_path, INVar_model_path, INBPMN_model_path, OUTVar_model_path}.");
			} else {
				Bpmnplvar2pnplvar runner = new Bpmnplvar2pnplvar();
				runner.loadModels(args[0], args[1], args[2]);
				runner.doBpmnplvar2pnplvar(new NullProgressMonitor());
				runner.saveModels(args[3]);
			}
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor.
	 *
	 * @generated
	 */
	public Bpmnplvar2pnplvar() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("Bpmnplvar2pnplvar.properties").openStream());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param inpnModelPath
	 *            the INPN model path
	 * @param invarModelPath
	 *            the INVar model path
	 * @param inbpmnModelPath
	 *            the INBPMN model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String inpnModelPath, String invarModelPath, String inbpmnModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel pnplvariabilityMetamodel = factory.newReferenceModel();
		injector.inject(pnplvariabilityMetamodel, getMetamodelUri("pnplVariability"));
	 	IReferenceModel bpmnMetamodel = factory.newReferenceModel();
		injector.inject(bpmnMetamodel, getMetamodelUri("bpmn"));
	 	IReferenceModel pnsMetamodel = factory.newReferenceModel();
		injector.inject(pnsMetamodel, getMetamodelUri("pns"));
	 	IReferenceModel bpmnplvariabilityMetamodel = factory.newReferenceModel();
		injector.inject(bpmnplvariabilityMetamodel, getMetamodelUri("bpmnplVariability"));
		this.inpnModel = factory.newModel(pnsMetamodel);
		injector.inject(inpnModel, inpnModelPath);
		this.invarModel = factory.newModel(bpmnplvariabilityMetamodel);
		injector.inject(invarModel, invarModelPath);
		this.inbpmnModel = factory.newModel(bpmnMetamodel);
		injector.inject(inbpmnModel, inbpmnModelPath);
		this.outvarModel = factory.newModel(pnplvariabilityMetamodel);
	}

	/**
	 * Save the output and input/output models.
	 * 
	 * @param outvarModelPath
	 *            the OUTVar model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(String outvarModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(outvarModel, outvarModelPath);
	}

	/**
	 * Transform the models.
	 * 
	 * @param monitor
	 *            the progress monitor
	 * @throws ATLCoreException
	 *             if an error occurs during models handling
	 * @throws IOException
	 *             if a module cannot be read
	 * @throws ATLExecutionException
	 *             if an error occurs during the execution
	 *
	 * @generated
	 */
	public Object doBpmnplvar2pnplvar(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(inpnModel, "INPN", "pns");
		launcher.addInModel(invarModel, "INVar", "bpmnplVariability");
		launcher.addInModel(inbpmnModel, "INBPMN", "bpmn");
		launcher.addOutModel(outvarModel, "OUTVar", "pnplVariability");
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
	}
	
	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 * 
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 *
	 * @generated
	 */
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("Bpmnplvar2pnplvar.modules");
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}
	
	/**
	 * Returns the URI of the given metamodel, parameterized from the property file.
	 * 
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 *
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("Bpmnplvar2pnplvar.metamodels." + metamodelName);
	}
	
	/**
	 * Returns the file name of the given library, parameterized from the property file.
	 * 
	 * @param libraryName
	 *            the library name
	 * @return the library file name
	 *
	 * @generated
	 */
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("Bpmnplvar2pnplvar.libraries." + libraryName)).openStream();
	}
	
	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 *
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("Bpmnplvar2pnplvar.options.")) {
				options.put(entry.getKey().toString().replaceFirst("Bpmnplvar2pnplvar.options.", ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
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

	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
