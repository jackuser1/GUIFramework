package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	
	WebDriver driver;
	public AdminHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement adminlogoutimage;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement adminlogoutbutton;
	
	@FindBy(xpath = "//a[@href='change-password.php']")
	private WebElement changepasswordbutton;
	
	@FindBy(name = "password")
	private WebElement currentpasswordtextfield;

	@FindBy(name = "newpassword")
	private WebElement newpasswordtextfield;
	
	@FindBy(name = "confirmpassword")
	private WebElement confirmnewpasswordtextfield;
	
	@FindBy(name = "submit")
	private WebElement changepasswordsubmitbutton;
	
	@FindBy(xpath = "//a[text()='Insert Product ']")
	private WebElement insertproductLink;
	
	@FindBy(xpath = "//a[text()=' Create Category ']")
	private WebElement createCategoryLink;
	
	@FindBy(xpath = "//a[@href='subcategory.php']")
	private WebElement createSubCategoryLink;
	

	public WebElement getCreateSubCategoryLink() {
		return createSubCategoryLink;
	}

	public WebElement getcreateCategoryLink() {
		return createCategoryLink;
	}
	
	public WebElement getinsertproductLink() {
		return insertproductLink;
	}
	
	public WebElement getCurrentpasswordtextfield() {
		return currentpasswordtextfield;
	}

	public WebElement getNewpasswordtextfield() {
		return newpasswordtextfield;
	}

	public WebElement getConfirmnewpasswordtextfield() {
		return confirmnewpasswordtextfield;
	}

	public WebElement getChangepasswordsubmitbutton() {
		return changepasswordsubmitbutton;
	}

	public WebElement getChangepasswordbutton() {
		return changepasswordbutton;
	}

	public WebElement getAdminlogoutimage() {
		return adminlogoutimage;
	}

	public WebElement getAdminlogoutbutton() {
		return adminlogoutbutton;
	}
	
	/*
	 * method to logout
	 */
    public void adminlogout() {
		
		adminlogoutimage.click();
		adminlogoutbutton.click();
	}
	
}
