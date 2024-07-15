package shopping_Admin.ModuleTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.Adminobjectrepository_utility.AdminHomePage;
import com.comcast.crm.Adminobjectrepository_utility.CreateCategoryPage;
import com.comcast.crm.generic.basetest.AdminBaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;

@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class CreateCategoryTest extends AdminBaseClass {
	/**
	 * Test script for creating category
	 * 
	 * @throws Throwable
	 */
	@Test
	public void createCategoryTest() throws Throwable {
		/*
		 * creating object of AdminHomePage clicking on createCategory link
		 */
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getcreateCategoryLink().click();

		/* reading data from excel sheet */
		String categoryname = eLib.getDataFromExcel("admin", 5, 0);

		/*
		 * creating object of CreateCategoryPage passing data in CategorynameTextfield
		 */
		CreateCategoryPage ccp = new CreateCategoryPage(driver);
		ccp.getCategorynameTextfield().sendKeys(categoryname);

		/* clicking on create button */
		ccp.getCreatebutton().click();

		/* passing data in search bar */
		ccp.getSearchbar().sendKeys(categoryname);

		/*
		 * capturing the category name which is created And verifying the category is
		 * successfully created
		 */
		String categoryinfo = driver.findElement(By.xpath("//th[text()='Category']/../../../tbody/tr//td[text()='" + categoryname + "']")).getText();

		Assert.assertEquals(categoryinfo, categoryname);
		Reporter.log("category created successfully", true);
		UtilityClassObject.getTest().log(Status.PASS, categoryname + "category added successfully");

	}
}
