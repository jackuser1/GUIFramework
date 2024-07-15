package shopping_Admin.ModuleTest;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.Adminobjectrepository_utility.AdminHomePage;
import com.comcast.crm.Adminobjectrepository_utility.InsertProductPage;
import com.comcast.crm.Adminobjectrepository_utility.ManageProductPage;
import com.comcast.crm.generic.basetest.AdminBaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

import junit.framework.Assert;

public class InsertProductTest extends AdminBaseClass {

	@Test
	public void insertProductTest() throws Throwable {

		/*  creating object of AdminHomePage
		 *  to click on insert product link */
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getinsertproductLink().click();
		

		/* loading all web element of this page */
		InsertProductPage ipp = new InsertProductPage(driver);
		/* handling category dropdown*/
		wdu.select(ipp.getCategoryDropdown(), "Music");
		/* handling subcategory dropdown*/
		wdu.select(ipp.getSubcategoryDropdown(), "Soundbars");

		String PRODUCTNAME = eLib.getDataFromExcel("admin", 1, 0);
		ipp.getProductnameTextfield().sendKeys(PRODUCTNAME);

		String PRODUCTCOMPANY = eLib.getDataFromExcel("admin", 1, 1);
		ipp.getProductCompanyTextfield().sendKeys(PRODUCTCOMPANY);

		String PRODUCTPRICE = eLib.getDataFromExcel("admin", 1, 2);
		ipp.getProductpriceTextfield().sendKeys(PRODUCTPRICE);

		String PRODUCTDISCOUNTEDPRICE = eLib.getDataFromExcel("admin", 1, 3);
		ipp.getDiscountedproductpriceTextfield().sendKeys(PRODUCTDISCOUNTEDPRICE);

		String PRODUCTDESCRIPTION = eLib.getDataFromExcel("admin", 1, 4);
		ipp.getProductdescriptionTextfield().sendKeys(PRODUCTDESCRIPTION);

		Thread.sleep(4000);
		wdu.select(ipp.getProductAvailabilityDropdown(), "In Stock");

		String SHIPPINGCHARGE = eLib.getDataFromExcel("admin", 1, 5);
		ipp.getShippingchargeTextfield().sendKeys(SHIPPINGCHARGE);

		Thread.sleep(2000);

		/*handling file upload popup */
		ipp.getProductimage1upload().sendKeys("C:\\Users\\Pankaj\\OneDrive\\Desktop\\bar1.avif");
		ipp.getProductimage2upload().sendKeys("C:\\\\Users\\\\Pankaj\\\\OneDrive\\\\Desktop\\\\bar2.avif");
		ipp.getProductimage3upload().sendKeys("C:\\\\Users\\\\Pankaj\\\\OneDrive\\\\Desktop\\\\bar3.avif");

		/* click on insert button */
		Actions act = new Actions(driver);
        act.scrollByAmount(0, 100).perform();
        ipp.getInsertbutton().click();
		
        /*
         * loading and using elements of this page
         */
		ManageProductPage mpp = new ManageProductPage(driver);
		mpp.getManageProductLink().click();
		mpp.getSearchBar().sendKeys(PRODUCTNAME);

		String productinfo = driver.findElement(By.xpath("//th[@role=\"columnheader\"]/../../..//tbody/tr//td[text()='" + PRODUCTNAME + "']")).getText();
		
		/*verifying product got inserted properly*/
		Assert.assertEquals(productinfo, PRODUCTNAME);
	   
		Reporter.log("Product inserted properly", true);
	    UtilityClassObject.getTest().log(Status.PASS, "Product is successfully added");
	
	}

}
