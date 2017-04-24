package com.pokegoapi.api.settings.templates;

import java.io.File;
import java.io.IOException;

/**
 * File {@link ItemTemplateProvider} that stores templates in the temporary directory
 */
public class TempFileTemplateProvider extends FileTemplateProvider {
	public static String tempDirectory;

	/**
	 * Creates a {@link TempFileTemplateProvider}
	 *
	 * @throws IOException if the templates could not be loaded
	 */
	public TempFileTemplateProvider() throws IOException {
		//super(new File(System.getProperty("java.io.tmpdir")));
		super(new File(tempDirectory));
	}
}
