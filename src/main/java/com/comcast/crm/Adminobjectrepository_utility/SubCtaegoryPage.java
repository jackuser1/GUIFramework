package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.basetest.AdminBaseClass;

public class SubCtaegoryPage{


	WebDriver driver;
	public SubCtaegoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="category")
	private WebElement selectcategoryDropdown;
	
	@FindBy(xpath="//input[@placeholder='Enter SubCategory Name']")
	private WebElement subcategorynameTextfield;
	
	@FindBy(name="submit")
	private WebElement createbttn;

	@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
	private WebElement subcatsearchBar;
	
	
	
	public WebElement getSubcatsearchBar() {
		return subcatsearchBar;
	}

	public WebElement getSelectcategoryDropdown() {
		return selectcategoryDropdown;
	}

	public WebElement getSubcategorynameTextfield() {
		return subcategorynameTextfield;
	}

	public WebElement getCreatebttn() {
		return createbttn;
	}
	
	

}
