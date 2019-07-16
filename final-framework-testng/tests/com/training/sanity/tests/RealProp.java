package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RealPropPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RealProp {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RealPropPOM realPropPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		realPropPOM = new RealPropPOM(driver);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() {
		realPropPOM.login();
		realPropPOM.sendUserName("admin");
		realPropPOM.sendPassword("adminuser@12345");
		realPropPOM.clickLoginBtn(); 
		realPropPOM.Properties();
		realPropPOM.AddNew();
		realPropPOM.sendPostTitle("New Launch");
		realPropPOM.sendText("New Launch");
		realPropPOM.clickPublishBtn();	
		realPropPOM.AllPro();
		//screenShot.captureScreenShot("First");
		
		
	}
}
