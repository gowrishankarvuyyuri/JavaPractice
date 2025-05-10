package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

class Create_Write {
	public static void Create_Write_Prop() throws IOException {
		
		Properties prop = new Properties();
		
		//stores the data in reverse order i.e., Address > Email > Name
		prop.setProperty("Address", "Penumantra");
		prop.setProperty("Email","vgowrishankar2002@gmail.com");
		prop.setProperty("Name", "Gowri Shankar");
		
		String file_Path = System.getProperty("user.dir")+"\\data\\PropertiesFile.properties";
		//String file_Path = "C:\\Users\\gowri\\OneDrive\\Desktop\\PropertiesFile.properties";
		
		FileOutputStream file = new FileOutputStream(file_Path);
		
		prop.store(file, "Added Gowri Shankar Details");
		
		file.close();
	}
}

class Read_Properties {
	
		public static void ReadValues_Prop() throws IOException {
		
			Properties prop = new Properties();
			
			String file_Path = System.getProperty("user.dir")+"\\data\\PropertiesFile.properties";
			FileInputStream file = new FileInputStream(file_Path);
			
			prop.load(file);
			
			//printing data individualy through key
			System.out.println(prop.getProperty("Name"));
			System.out.println(prop.getProperty("Email"));
			System.out.println(prop.getProperty("Address"));
			
			//fetches all key names in string format
			Set<String> Keys = prop.stringPropertyNames();
			System.out.println(Keys);
			
			//fetches all key names in object format
			Set<Object> keys = prop.keySet();
			System.out.println(keys);
			
			//fetches last set of values 
			Collection <Object> values = prop.values();
			System.out.println(values);
			
			//fetches all key-value pair of last setS
			for(String key : prop.stringPropertyNames()) {
				System.out.println(key + ": " + prop.getProperty(key));
			}
			
			file.close();
		
	}
}

public class PropertiesFile_Operations {

	public static void main(String[] args) throws IOException {
		
		//creation of properties - file
		//Create_Write.Create_Write_Prop();
		Read_Properties.ReadValues_Prop();
	}

}
