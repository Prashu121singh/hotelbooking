package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	public static String readConfig(String Parameter) throws IOException {
		
		FileInputStream file=new FileInputStream("D:\\Users\\Temp\\Desktop\\config.properties");
		Properties p=new Properties();
		p.load(file);
		
		String x=p.getProperty(Parameter);
		return x;
		
	}

}
