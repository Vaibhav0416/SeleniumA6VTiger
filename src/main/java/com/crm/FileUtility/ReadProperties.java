package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String loginData(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Vaibhav\\eclipse-workspace\\com.crm.VTiger1\\src\\test\\resources\\LoginFunction.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
		
	}

}
