package com.crm.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Baseclass.VtigerBaseClass;
import com.crm.JavaUtility.Calender;

public class ContactsCalender extends VtigerBaseClass {

	public ContactsCalender(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//a[text()='Contacts']") WebElement contacts;

	private @FindBy(xpath = "//img[@title='Create Contact...']") WebElement plus;

	private @FindBy(id = "jscal_trigger_support_start_date") WebElement startDate;

	private @FindBy(id = "jscal_trigger_support_end_date") WebElement endDate;

	private @FindBy(xpath = "//input[@type='submit']") WebElement saveButton;

	public void contacts() {
		contacts.click();
	}

	public void plus() {
		plus.click();
	}

	public void startDate() {
		startDate.click();
		Calender.startDate();
	}

	public void endDate() {
		endDate.click();
		String date=Calender.afterDate();
		endDate.sendKeys(date);

	}

	public void saveButton() {
		saveButton.click();
	}

}
