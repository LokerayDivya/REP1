package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealestatePOM {
private WebDriver driver; 
	public RealestatePOM(WebDriver driver) {
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
}


