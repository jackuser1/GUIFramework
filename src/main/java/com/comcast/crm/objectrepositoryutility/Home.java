package com.comcast.crm.objectrepositoryutility;

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
public class Home extends WebDriverUtility{                             
                           
	@FindBy(xpath="//a[text()='Login']")
	private WebElement userLoginLink;
	
	@FindBy(xpath="//a[text()='Admin Login']")
	private WebElement adminLoginLink;
	
	
}
