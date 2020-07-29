package com.crm.qa.pages;

import org.openqa.selenium.By;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase{

	By userNameLabel = By.xpath("//td[contains(text(), 'User: Nicodemus Ongoto')]");
	By dealsLink = By.xpath("//a[@title='Deals']");
	By homeLink = By.xpath("//a[@title='Home']");
	By tasksLink = By.xpath("//a[@title='Tasks']");
	By calendarLink = By.xpath("//a[@title='Calendar']");
	By companiesLink = By.xpath("//a[@title='Companies']");
	By contactsLink = By.xpath("//a[@title='Contacts']");

	TestUtil testUtil = new TestUtil(driver);
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public String verifyCorrrectUserName() {
		//util.switchToFrame();
		return testUtil.getElement(userNameLabel).getText();
	}
	
	public ContactsPage clickOnContactsLink() {
		testUtil.doClick(contactsLink);
		return new ContactsPage();
	}
	
	public HomePage clickOnHomeLink() {
		testUtil.doClick(homeLink);
		return new HomePage();
	}
	
	public DealsPage clickOnDealsLink() {
		testUtil.doClick(dealsLink);
		return new DealsPage();
	}
	
	public CompaniesPage clickOnCompaniesLink() {
		testUtil.doClick(companiesLink);
		return new CompaniesPage();
	}
	
	public CalendarPage clickOnCalendarLink() {
		testUtil.doClick(calendarLink);
		return new CalendarPage();
	}
	
	public TasksPage clickOnTasksLink() {
		testUtil.doClick(tasksLink);
		return new TasksPage();
	}
}
