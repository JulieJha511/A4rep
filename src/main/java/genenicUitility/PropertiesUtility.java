package genenicUitility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	public String getDataFormProperties(String Data) throws Exception{
		FileInputStream fis = new FileInputStream("\"C:\\Users\\Desktop\\selenium\\commondata.properties\"");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(Data);
		return value;
		
	}

}
