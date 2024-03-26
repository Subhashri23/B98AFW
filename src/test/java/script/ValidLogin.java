package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test(priority = 1)
	public void testValidLogin()
	{
//		1. enter valid user name: admin
		test.info(" enter valid user name");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
		 
//		2. enter valid password: pointofsale
		test.info("enter valid password");
		loginPage.setPassword("pointofsale");
		
//		3. click on go button
		test.info("click on go button");
		loginPage.clickGoButton();
		
//		4. verification: Home page should be displayed
		test.info("verification: Home page should be displayed");
		HomePage homePage=new HomePage(driver);
		boolean result = homePage.verifyHomePageIsDisplayed(wait);
		Assert.assertTrue(result);

	}
}
