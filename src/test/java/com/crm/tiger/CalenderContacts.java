package com.crm.tiger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.Baseclass.VtigerBaseClass;
import com.crm.POM.ContactsCalender;

public class CalenderContacts extends VtigerBaseClass {

	@Test
	public void fillDate() throws InterruptedException {
		ContactsCalender cal = new ContactsCalender(driver);
		cal.contacts();
		cal.plus();
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		cal.startDate();
		Thread.sleep(4000);
		cal.endDate();
		Thread.sleep(4000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		cal.saveButton();
		act.keyUp(Keys.PAGE_DOWN).keyUp(Keys.PAGE_UP).build().perform();
	}

}
