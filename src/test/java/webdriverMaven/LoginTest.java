package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.ChromeDriverManager;
//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class LoginTest {

	 //ChromeDriverManager.getInstance().setup();
	public static WebDriver driver;
	
	@BeforeSuite	
public void setup() {
		
		//ChromeDriverManager.getInstance().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sridevi\\Documents\\seleniumTutorials\\sleniumRCjar\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
	
}
@Test
public void doLogin() {

	driver.get("http://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("sridevigk2@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
	

}


@AfterSuite
public void tearDown() {
	driver.quit();
	
	
	
}
}