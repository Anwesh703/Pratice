package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public String getDataFromProperty(String key) throws IOException {
		Properties prop = new Properties();
		FileReader fr = new FileReader(new File("C:\\Automation\\Dummy\\SeleniumTesting\\config.properties"));
		prop.load(fr);
        return prop.getProperty(key);
	}
}
