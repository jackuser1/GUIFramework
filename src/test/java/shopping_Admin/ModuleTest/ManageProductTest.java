package shopping_Admin.ModuleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.comcast.crm.Adminobjectrepository_utility.AdminHomePage;
import com.comcast.crm.Adminobjectrepository_utility.InsertProductPage;
import com.comcast.crm.Adminobjectrepository_utility.ManageProductPage;
import com.comcast.crm.generic.basetest.AdminBaseClass;

public class ManageProductTest extends AdminBaseClass {

	@Test
	public void manageProductTest() throws Throwable {

		/*
		 * creating object of AdminHomePage to click on insert product link
		 */
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.getinsertproductLink().click();

		/* loading all web element of this page */
		InsertProductPage ipp = new InsertProductPage(driver);

		/* handling category dropdown */
		wdu.select(ipp.getCategoryDropdown(), "Music");

		/* handling subcategory dropdown */
		wdu.select(ipp.getSubcategoryDropdown(), "Soundbars");

		/* Reading data from Excel */
		String PRODUCTNAME = eLib.getDataFromExcel("admin", 2, 0);
		ipp.getProductnameTextfield().sendKeys(PRODUCTNAME);

		String PRODUCTCOMPANY = eLib.getDataFromExcel("admin", 2, 1);
		ipp.getProductCompanyTextfield().sendKeys(PRODUCTCOMPANY);

		String PRODUCTPRICE = eLib.getDataFromExcel("admin", 2, 2);
		ipp.getProductpriceTextfield().sendKeys(PRODUCTPRICE);

		String PRODUCTDISCOUNTEDPRICE = eLib.getDataFromExcel("admin", 2, 3);
		ipp.getDiscountedproductpriceTextfield().sendKeys(PRODUCTDISCOUNTEDPRICE);

		String PRODUCTDESCRIPTION = eLib.getDataFromExcel("admin", 2, 4);
		ipp.getProductdescriptionTextfield().sendKeys(PRODUCTDESCRIPTION);

		/* handling select dropdown */
		wdu.select(ipp.getProductAvailabilityDropdown(), "In Stock");

		String SHIPPINGCHARGE = eLib.getDataFromExcel("admin", 2, 5);
		ipp.getShippingchargeTextfield().sendKeys(SHIPPINGCHARGE);

		/* handling file upload popup */
		ipp.getProductimage1upload().sendKeys("C:\\Users\\Pankaj\\OneDrive\\Desktop\\bar1.avif");
		ipp.getProductimage2upload().sendKeys("C:\\\\Users\\\\Pankaj\\\\OneDrive\\\\Desktop\\\\bar2.avif");
		ipp.getProductimage3upload().sendKeys("C:\\\\Users\\\\Pankaj\\\\OneDrive\\\\Desktop\\\\bar3.avif");

		/* click on insert button */
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 100).perform();

		/* clicking on insert button */
		ipp.getInsertbutton().click();

		/*
		 * loading and using elements of this page
		 */
		ManageProductPage mpp = new ManageProductPage(driver);
		mpp.getManageProductLink().click();

		/* search the product which you have added */
		mpp.getSearchBar().sendKeys(PRODUCTNAME);

		/* click on edit icon of that product */
		driver.findElement(By.xpath("//td[text()='" + PRODUCTNAME + "']/../td/a//i[@class='icon-edit']")).click();

		/* handling category dropdown */
		wdu.select(ipp.getCategoryDropdown(), "Music");
		/* handling subcategory dropdown */
		wdu.select(ipp.getSubcategoryDropdown(), "Soundbars");

		String PRODUCTNAMECHANGED = eLib.getDataFromExcel("admin", 3, 0);
		ipp.getProductnameTextfield().clear();
		ipp.getProductnameTextfield().sendKeys(PRODUCTNAMECHANGED);

		String PRODUCTCOMPANYCHANGED = eLib.getDataFromExcel("admin", 3, 1);
		ipp.getProductCompanyTextfield().clear();
		ipp.getProductCompanyTextfield().sendKeys(PRODUCTCOMPANYCHANGED);

		String PRODUCTPRICECHANGED = eLib.getDataFromExcel("admin", 3, 2);
		ipp.getProductpriceTextfield().clear();
		ipp.getProductpriceTextfield().sendKeys(PRODUCTPRICECHANGED);

		String PRODUCTDISCOUNTEDPRICECHANGED = eLib.getDataFromExcel("admin", 3, 3);
		ipp.getDiscountedproductpriceTextfield().clear();
		ipp.getDiscountedproductpriceTextfield().sendKeys(PRODUCTDISCOUNTEDPRICECHANGED);

		String PRODUCTDESCRIPTIONCHANGED = eLib.getDataFromExcel("admin", 3, 4);
		ipp.getProductdescriptionTextfield().clear();
		ipp.getProductdescriptionTextfield().sendKeys(PRODUCTDESCRIPTIONCHANGED);

		Thread.sleep(4000);
		wdu.select(ipp.getProductAvailabilityDropdown(), "In Stock");

		String SHIPPINGCHARGECHANGED = eLib.getDataFromExcel("admin", 3, 5);
		ipp.getShippingchargeTextfield().clear();
		ipp.getShippingchargeTextfield().sendKeys(SHIPPINGCHARGECHANGED);

		/* using actions class methjod scrolling the page */
		act.scrollByAmount(0, 300).perform();

		/* changing productimage1 */
		driver.findElement(By.xpath("//label[text()='Product Image1']/../div//a[text()='Change Image']")).click();
		/* handling file upload popup */
		driver.findElement(By.id("productimage1")).sendKeys("C:\\Users\\Pankaj\\OneDrive\\Desktop\\jb1.jpg");
		act.scrollByAmount(0, 100).perform();
		driver.findElement(By.name("submit")).click();

		driver.navigate().back();
		driver.navigate().back();

		act.scrollByAmount(0, 300).perform();
		
		/* click on update button to update product details */
		driver.findElement(By.xpath("//button[text()='Update']")).click();

	}

}
