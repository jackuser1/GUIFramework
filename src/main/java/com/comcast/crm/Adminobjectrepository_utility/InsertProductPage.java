package com.comcast.crm.Adminobjectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InsertProductPage {

WebDriver driver;
	
	public InsertProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "category")
	private WebElement categoryDropdown;

	@FindBy(id = "subcategory")
	private WebElement subcategoryDropdown;
	
	@FindBy(name = "productName")
	private WebElement productnameTextfield;
	
	@FindBy(name = "productCompany")
	private WebElement productCompanyTextfield;
	
	@FindBy(name = "productpricebd")
	private WebElement productpriceTextfield;
	
	@FindBy(name = "productprice")
	private WebElement discountedproductpriceTextfield;
	
	@FindBy(xpath = "//div[@contenteditable='true']")
	private WebElement productdescriptionTextfield;
	
	@FindBy(name = "productShippingcharge")
	private WebElement shippingchargeTextfield;
	
	@FindBy(id = "productAvailability")
	private WebElement productAvailabilityDropdown;
	
	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement productimage1upload;
	
	@FindBy(xpath = "(//input[@type='file'])[2]")
	private WebElement productimage2upload;
	
	@FindBy(xpath = "(//input[@type='file'])[3]")
	private WebElement productimage3upload;
	
	@FindBy(xpath ="//button[text()='Insert']")
	private WebElement insertbutton;

	public WebElement getInsertbutton() {
		return insertbutton;
	}

	public WebElement getCategoryDropdown() {
		return categoryDropdown;
	}

	public WebElement getSubcategoryDropdown() {
		return subcategoryDropdown;
	}

	public WebElement getProductnameTextfield() {
		return productnameTextfield;
	}

	public WebElement getProductCompanyTextfield() {
		return productCompanyTextfield;
	}

	public WebElement getProductpriceTextfield() {
		return productpriceTextfield;
	}

	public WebElement getDiscountedproductpriceTextfield() {
		return discountedproductpriceTextfield;
	}

	public WebElement getProductdescriptionTextfield() {
		return productdescriptionTextfield;
	}

	public WebElement getShippingchargeTextfield() {
		return shippingchargeTextfield;
	}

	public WebElement getProductAvailabilityDropdown() {
		return productAvailabilityDropdown;
	}

	public WebElement getProductimage1upload() {
		return productimage1upload;
	}

	public WebElement getProductimage2upload() {
		return productimage2upload;
	}

	public WebElement getProductimage3upload() {
		return productimage3upload;
	}
	
	
	
	
	
	
	
	
	
	

	
}
