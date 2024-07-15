package shopping_Admin.ModuleTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.comcast.crm.Adminobjectrepository_utility.AdminHomePage;
import com.comcast.crm.Adminobjectrepository_utility.SubCtaegoryPage;
import com.comcast.crm.generic.basetest.AdminBaseClass;

import freemarker.ext.jsp.TaglibFactory.WebInfPerLibJarMetaInfTldSource;

public class CreateSubCategoryTest extends AdminBaseClass {

	/**
	 * Test script for creating sub category
	 * @throws Throwable
	 */
	@Test
	public void createSubCategoryTest() throws Throwable {
		
		/*
		 * Creating object of AdminHomePage
		 * click on subcategory Link
		 */
		AdminHomePage ahp= new AdminHomePage(driver);
		ahp.getCreateSubCategoryLink().click();
		
		/* creating object of SubCtaegoryPage */
		SubCtaegoryPage scp=new SubCtaegoryPage(driver);
		
		/*handling select dropdown*/
		wdu.select(scp.getSelectcategoryDropdown(), "Music");
		
		/*reading data from excel*/
	    String subcategoryname = eLib.getDataFromExcel("admin", 5, 1);
		scp.getSubcategorynameTextfield().sendKeys(subcategoryname);
		
		/*clicking on create button*/
		scp.getCreatebttn().click();
		
		/*searching subcategory in search bar*/
		scp.getSubcatsearchBar().sendKeys(subcategoryname);
		
		/*capturing the name of the sub category created for verification*/ 
		String subcategoryInfo = driver.findElement(By.xpath("//th[text()='Description']/../../../tbody/tr//td[text()='"+subcategoryname+"']")).getText();		
		
		/*using Assert for validation*/
		Assert.assertEquals(subcategoryInfo, subcategoryname);
		
		/*getting testng reports*/
		Reporter.log("sub category created successfully", true);
	}
	
	
}
