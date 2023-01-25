package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	/**
	 * Initialize property from config file and this method needs to be called in Before hooks
	 */
	public static void initProperty() {
		try {
			FileReader reader = new FileReader("src//test//resources//config//config.properties");
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Retrive proprty from config file to java
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
