package fr.bdss.jersey.method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyMethod {
	static String propertyValue = "";
	static InputStream inputStream;
	
	public static String getPropValue(String propertyName) throws IOException {
		 
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
			inputStream = new FileInputStream(propFileName);
			prop.load(inputStream);
  
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			// get the property value and print it out
			propertyValue = prop.getProperty(propertyName);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return propertyValue;
	}
}
