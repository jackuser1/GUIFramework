package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{    
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
                           
	@FindBy(id="exampleInputEmail1")
	private WebElement emailTextField;
	
	@FindBy(id="exampleInputPassword1")
	private WebElement passwordTextField;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 */
	 public void userloginToapp(String url , String username , String password) {
		 
		 emailTextField.sendKeys(username);
		 passwordTextField.sendKeys(password);
		 loginButton.click();
		 
		 
		 
	 }
	
	
}
