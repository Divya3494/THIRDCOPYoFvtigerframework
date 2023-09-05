package seleniumPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class InsertDataIntoPopertyClass {

	@Test
	public void insertDataIntoPopertyClass() throws IOException { 
	//public static void main(String[] args) throws IOException {
		
		Properties property=new Properties();
		property.setProperty("URL", "https://www.facebook.com/");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/InsertedFile.properties");
		property.store(fos, "Common Data");
		System.out.println("Data written successfully");
		
		                        

	}

}
