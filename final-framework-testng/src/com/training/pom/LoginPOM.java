package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement login; 
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email; 
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement First;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement Last;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement loginBtn;
	
		
	public void login() {
		this.login.click();
	}	
		public void Register() {
			this.Register.click();
	}
		
		public void sendEmail(String Email) {
			this.Email.clear();
			this.Email.sendKeys(Email);
		}
		
		public void sendFirstName(String First) {
			this.First.clear();
			this.First.sendKeys(First);
		}

		
	public void sendLastName(String Last) {
		this.Last.clear(); 
		this.Last.sendKeys(Last); 
	}
		
	public void sendUserName(String First) {
			this.First.clear();
			this.First.sendKeys(First);
		}
	
		
	public void sendPassword(String Last) {
		this.Last.clear(); 
		this.Last.sendKeys(Last); 
	}
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
