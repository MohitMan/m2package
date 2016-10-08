package personal.m2project.m2package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonMethods {
	Properties properties = new Properties();
	FileInputStream fileInput = null;
	
	Properties property_initiate() throws IOException
	{
		fileInput = new FileInputStream("EnvironmentVariables.properties");
		properties.load(fileInput);
		return properties;
	}
}
