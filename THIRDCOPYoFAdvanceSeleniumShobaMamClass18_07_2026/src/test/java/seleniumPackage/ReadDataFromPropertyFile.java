package seleniumPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertyFile {

	@Test
	public void ReadDataFromPropertyFile()  throws IOException {
	//public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/AdvSeleniumShobamamClassCommonDataFile.properties");	
	Properties property=new Properties();
	property.load(fis);
	String URL= property.getProperty("url");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	
	}

}
