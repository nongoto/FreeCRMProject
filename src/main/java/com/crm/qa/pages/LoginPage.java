package com.crm.qa.pages;

import org.openqa.selenium.By;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {

	By lusername = By.xpath("//input[@name = 'username']");
	By lpassword = By.xpath("//input[@name = 'password']");
	By lloginbtn = By.cssSelector("input.btn.btn-small");
	By lhome = By.xpath("//div/ul//a[text() = 'Home']");
	By lpricing = By.xpath("//div/ul//a[text() = 'Pricing']");
	By lfeatures = By.xpath("//div/ul//a[text() = 'Features']");
	By lcustomers = By.xpath("//div/ul//a[text() = 'Customers']");
	By lcontact = By.xpath("//div/ul//a[text() = 'Contact']");
	By lsignup = By.xpath("//div/ul//a[text() = 'Sign Up']");
	By llogo = By.xpath("//a[@class='navbar-brand']/img[@class='img-responsive']");
	By lHeaderLinksList = By.cssSelector("ul.nav.navbar-nav.navbar-right>li");

	TestUtil util = new TestUtil(driver);

	public boolean validateCRMLogo() {
		return util.doIsDisplayed(llogo);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage validatelogin() {
		util.doSendKeys(lusername, prop.getProperty("username"));
		util.doSendKeys(lpassword, prop.getProperty("password"));
		util.doClick(lloginbtn);
		return new HomePage();
	}
	
	public SignUpPage validateLoginPageHeaderSighUpMenuLink() {
		util.SelectChoiceValues(lHeaderLinksList, "Sign Up");
		return new SignUpPage();
	}
	
	public SignUpPage validateLoginPageHeaderHomeMenuLink() {
		util.SelectChoiceValues(lHeaderLinksList, "Home");
		return new SignUpPage();
	}
}
