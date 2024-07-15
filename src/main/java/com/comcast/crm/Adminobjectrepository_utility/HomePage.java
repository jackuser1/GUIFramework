package com.comcast.crm.Adminobjectrepository_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Pankaj
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class HomePage extends WebDriverUtility{
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
                           
	@FindBy(xpath="//a[text()='Login']")
	private WebElement userLoginLink;
	
	@FindBy(xpath="//a[text()='Admin Login']")
	private WebElement adminLoginLink;
	
	

	public WebElement getUserLoginLink() {
		return userLoginLink;
	}

	public WebElement getAdminLoginLink() {
		return adminLoginLink;
	}

	
	}
