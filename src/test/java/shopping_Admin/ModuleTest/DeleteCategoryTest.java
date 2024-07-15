package shopping_Admin.ModuleTest;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.Adminobjectrepository_utility.AdminHomePage;
import com.comcast.crm.Adminobjectrepository_utility.CreateCategoryPage;
import com.comcast.crm.generic.basetest.AdminBaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;

public class DeleteCategoryTest extends AdminBaseClass {

	/**
	 * Testscript for deleting category
	 * 
	 * @throws Throwable
	 */
	@Test
	public void deleteCategoryTest() throws Throwable {

		/*
		 * Creating object of AdminHomePage 
		 * click on subcategory Link
		 */
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getcreateCategoryLink().click();

		/*reading data from excel*/
		String categoryname = eLib.getDataFromExcel("admin", 6, 0);
		
		/* creating object of createCtaegoryPage 
		 * and passing the category name inside CategorynameTextfield
		 */
		CreateCategoryPage ccp = new CreateCategoryPage(driver);
		ccp.getCategorynameTextfield().sendKeys(categoryname);

		/*click on create category button*/
		ccp.getCreatebutton().click();

		/* Inside searchbar search for category you created*/
		ccp.getSearchbar().sendKeys(categoryname);
		
		/*verify the categoryname  and click on crossbutton*/
		driver.findElement(By.xpath("//td[text()='" + categoryname + "']/../td[6]/a[2]//i[@class='icon-remove-sign']"))
				.click();

		/* verifying alert is diplayed */
		wdu.validateAlertIsPresent(driver);
		Reporter.log("Alert is displayed", true);
	    UtilityClassObject.getTest().log(Status.PASS, "Alert is getting Displayed");
		
	    /*switch the driver control to alert and click on ok*/
	    wdu.switchtoAlertAndAccept(driver);
	    
	    UtilityClassObject.getTest().log(Status.PASS, "category deleted");
		Reporter.log("category deleted successfully", true);

	}

}
