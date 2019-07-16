package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealPropPOM {
	private WebDriver driver; 
	public RealPropPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//input[@id='publish']")
	private WebElement PublishBtn;
	
	@FindBy(xpath="//a[@class='wp-first-item current']")
	private WebElement AllPro;
	
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

	public void clickPublishBtn() {
		this.PublishBtn.click(); 
	}
	
	public void AllPro() {
		Actions se = new Actions(driver);
		se.moveToElement(AllPro);
		this.AllPro.click(); 
	}
}

