package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealURLPOM {
	private WebDriver driver; 
	public RealURLPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement login; 
	
	@FindBy(xpath="//input[@id='user_login']")
	private WebElement UserName ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password; 
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[text()='Properties']")
	private WebElement Properties; 
	
	@FindBy(xpath="//a[@class='page-title-action']")
	private WebElement AddNew;
	
	@FindBy(xpath="//input[@name='post_title']")
	private WebElement PostTitle; 
	
	@FindBy(xpath="//textarea[@id='content']")
	private WebElement Text;
	
	@FindBy(xpath="//textarea[@id='_price']")
	private WebElement Price; 
	
	@FindBy(xpath="//input[@name='_price_per']")
	private WebElement Priceper;
	
	@FindBy(xpath="//a[text()='Main Details']")
	private WebElement Main; 
	
	@FindBy(xpath="//input[@name='_status']")
	private WebElement Status;
	
	@FindBy(xpath="//input[@name='_location']")
	private WebElement location; 
	
	@FindBy(xpath="//input[@name='_possession']")
	private WebElement Possession;
	
	@FindBy(xpath="//a[text()='Location']")
	private WebElement Loc;
	
	@FindBy(xpath="//input[@id='_friendly_address']")
	private WebElement Address; 
	
	@FindBy(xpath="//input[@name='_address']")
	private WebElement GoogleAddress; 
	
	@FindBy(xpath="//input[contains(@id,'_lat')]")
	private WebElement Lat;
	
	@FindBy(xpath="//input[contains(@id,'_long')]")
	private WebElement Long;
	
	@FindBy(xpath="//a[text()='Details']")
	private WebElement details; 
	
	@FindBy(xpath="//input[@id='_storage_room']")
	private WebElement Store;
	
	@FindBy(xpath="(//input[@value='57'])[3]")
	private WebElement Central; 

	@FindBy(xpath="//input[@class='button button-primary button-large']")
	private WebElement PublishBtn;
	
		public void login() {
		this.login.click();
	}	
		
	public void sendUserName(String UserName) {
			this.UserName.clear();
			this.UserName.sendKeys(UserName);
		}
	
		
	public void sendPassword(String Password) {
		this.Password.clear(); 
		this.Password.sendKeys(Password); 
	}
	
		public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
		
		public void Properties() {
			this.Properties.click();
		}	
		
		public void AddNew() {
			this.AddNew.click();
		}	

		public void sendPostTitle(String PostTitle) {
			this.PostTitle.clear();
			this.PostTitle.sendKeys(PostTitle);
		}
		
		public void sendText(String Text) {
			this.Text.clear(); 
			this.Text.sendKeys(Text); 
		}
		
		public void sendPrice(String Price) {
			this.Price.clear();
			this.Price.sendKeys(Price);
		}
		
		public void sendPriceper(String Priceper) {
			this.Priceper.clear(); 
			this.Priceper.sendKeys(Priceper); 
		}
		
		public void clickMain() {
			this.Main.click();
		}	
		
		public void sendStatus(String Status) {
			this.Status.clear();
			this.Status.sendKeys(Status);
		}
		
		public void sendlocation(String location) {
			this.location.clear(); 
			this.location.sendKeys(location); 
		}
		
		public void sendPossession(String Possession) {
			this.Possession.clear(); 
			this.Possession.sendKeys(Possession); 
		}

		public void clickLocation() {
			this.Loc.click();
		}	
		
		public void sendAddress(String Address) {
			this.Address.clear();
			this.Address.sendKeys(Address);
		}
		
		public void sendGoogleAddress(String GoogleAddress) {
			this.GoogleAddress.clear(); 
			this.GoogleAddress.sendKeys(GoogleAddress); 
		}
		
		public void sendLat(String Lat) {
			this.Lat.clear(); 
			this.Lat.sendKeys(Lat); 
		}
		
		public void sendLong(String Long) {
			this.Long.clear(); 
			this.Long.sendKeys(Long); 
		}

		public void clickdetails() {
			this.details.click();
		}
		
		public void sendStore(String Store) {
			this.Store.clear(); 
			this.Store.sendKeys(Store); 
		}
			
		public void clickCentral() {
			this.Central.click();
		}
			
		public void clickPublishBtn() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,-500)");
			//   Actions act = new Actions(driver);
		  //  act.moveToElement(PublishBtn);
		this.PublishBtn.click(); 
	}

}
