package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class loadProperties{
	
	public static String getProperties(String key) throws Throwable {
		String userDirectory = System.getProperty("user.dir");
        FileInputStream fileInputStream = new FileInputStream(userDirectory+"//config.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }

	
}
