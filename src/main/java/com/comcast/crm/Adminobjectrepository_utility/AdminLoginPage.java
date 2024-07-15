package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class AdminLoginPage extends WebDriverUtility{

	WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "inputEmail")
	private WebElement emailTextField;

	@FindBy(id = "inputPassword")
	private WebElement passwordTextField;

	@FindBy(name = "submit")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	/*
	 * business utility
	 */
	public void logintoadmin(String url,String adminusername,String adminpassword) {
		waitForPageToLoad(driver);
		driver.get(url);
		driver.manage().window().maximize();
        HomePage h=new HomePage(driver);
        h. getAdminLoginLink().click();
		emailTextField.sendKeys(adminusername);
		passwordTextField.sendKeys(adminpassword);
		loginButton.click();
	}

}
