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
import com.training.pom.RealURLPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RealURL {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RealURLPOM realurlPOM;
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
		realurlPOM = new RealURLPOM(driver);
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
	public void validLoginTest() throws InterruptedException {
		realurlPOM.login();
		realurlPOM.sendUserName("admin");
		realurlPOM.sendPassword("adminuser@12345");
		realurlPOM.clickLoginBtn(); 
		realurlPOM.Properties();
		realurlPOM.AddNew();
		realurlPOM.sendPostTitle("New Launch");
		realurlPOM.sendText("New Launch");
		realurlPOM.sendPrice("50000.00");
		realurlPOM.sendPriceper("200.00");
		realurlPOM.clickMain();
		realurlPOM.sendStatus("New");
		realurlPOM.sendlocation("Electronic city");
		realurlPOM.sendPossession("immediate");
		realurlPOM.clickLocation();
		realurlPOM.sendAddress("yeshwanthapur");
		realurlPOM.sendGoogleAddress("yeshwanthapur");
		realurlPOM.sendLat("120");
		realurlPOM.sendLong("56");
		realurlPOM.clickdetails();
		realurlPOM.sendStore("2");
		realurlPOM.clickCentral();
		//Thread.sleep(3000);
		realurlPOM.clickPublishBtn();	
		//screenShot.captureScreenShot("First");
	
}
}
