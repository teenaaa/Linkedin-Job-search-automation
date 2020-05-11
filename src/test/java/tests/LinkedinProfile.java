package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resource.Base;
import resource.LoginRepo;
import resource.SearchObjectRepository;

public class LinkedinProfile extends Base {

	// Test method to login
	@Test(dataProvider = "GetCredentials")
	public void Login(String userName, String password) throws IOException, InterruptedException {
		Linkedin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginRepo login = new LoginRepo(driver);
		login.ClickSignin().click();
		Thread.sleep(2000);
		login.EnterUserName().sendKeys(userName);
		login.EnterPassword().sendKeys(password);
		login.Submit().click();
	}

	// Test method for job search with advance filters
	@Test(dependsOnMethods = { "Login" })
	public void JobSearch() {
		SearchObjectRepository searchObj = new SearchObjectRepository(driver);
		
		searchObj.ClickSearch().sendKeys(props.getProperty("jobProfile"));
		searchObj.ClickSearch().sendKeys(Keys.ENTER);
		try {
			if (searchObj.CheckClearText().isDisplayed()) {
				System.out.println("Other filters are applied");
			}
		} catch (Exception ex) {
			System.out.println("No other filter is applied");
		} finally {
			searchObj.ClickLaunchPadcls().click();
			searchObj.OpenExpLevel().click();
			searchObj.SelectExpLevel().click();
			searchObj.ApplyExplevel().click();
			Assert.assertEquals(searchObj.CheckClearText().getText(), "Clear 1");
			searchObj.OpenAllFilter().click();
			searchObj.SelectJobType().click();
			searchObj.ApplyAllFilter().click();
			Assert.assertEquals(searchObj.CheckClearText().getText(), "Clear 2");
			searchObj.OpenUserSettings().click();
			searchObj.ClickSignout().click();
			
			driver.quit();
		}
	}

	// Data-provider for Credentials
	@DataProvider
	public Object[][] GetCredentials() {
		Object credentials[][] = new Object[1][2];
		credentials[0][0] = "companytest0511@gmail.com";
		credentials[0][1] = "Teen@999";
		return credentials;
	}
}
