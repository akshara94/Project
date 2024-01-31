package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class JavaUtili {
	
	public static String openURL(String key) throws Exception {
		
		//Readproperties methods
		
		String filepath = System.getProperty("user.dir")+ "/config.properties";
		
		String Value = null;
		try {
		
		Properties prop = new Properties();
		
        FileInputStream instream = new FileInputStream (filepath);
        
        prop.load(instream);
        
        Value = prop.getProperty(key);
        
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Value;
		
		
				
	}

}
