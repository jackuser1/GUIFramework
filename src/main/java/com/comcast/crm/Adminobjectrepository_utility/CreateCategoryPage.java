package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateCategoryPage {

	WebDriver driver;
	public CreateCategoryPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="category")
	private WebElement categorynameTextfield;
	
	@FindBy(name="submit")
	private WebElement createbutton;
	
	//input[@aria-controls="DataTables_Table_0"]
	@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
	private WebElement searchbar;
	
	@FindBy(xpath ="//i[@class='icon-remove-sign']")
	private WebElement crossbutton;
	

	public WebElement getCrossbutton() {
		return crossbutton;
	}
	public WebElement getSearchbar() {
		return searchbar;
	}
	public WebElement getCategorynameTextfield() {
		return categorynameTextfield;
	}
	public WebElement getCreatebutton() {
		return createbutton;
	}
	
	
}
