package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {

	WebDriver driver;
	public ManageProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Manage Products ']")
	private WebElement manageProductLink;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//a[@onclick=\"return confirm('Are you sure you want to delete?')\"]")
	private WebElement crossbutton;
	
	@FindBy(xpath = "//td[text()='apple']/../td/a//i[@class='icon-edit']")
	private WebElement producteditIcon;
	
	public WebElement getProducteditIcon() {
		return producteditIcon;
	}

	public WebElement getCrossbutton() {
		return crossbutton;
	}

	public WebElement getManageProductLink() {
		return manageProductLink;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}
	
	

	
	
	
	
}
