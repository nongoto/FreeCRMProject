package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		testUtil = new TestUtil(driver);
		homePage = loginPage.validatelogin();

	}

	@Test

	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle,
				"CRMPRO - CRM software for customer relationship management, sales, and support.",
				"Home Page title not matching");

	}

	@Test
	public void verifyCorrectUserNameTest() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		testUtil.switchToFrame();
		Assert.assertEquals(homePage.verifyCorrrectUserName(), "Nicodemus Ongoto", "Username not matching");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
