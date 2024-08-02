package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrgIndustry {

	public OrgIndustry(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//a[text()='Organizations']") WebElement organizations;

	private @FindBy(xpath = "//img[@title='Create Organization...']") WebElement plus;
	private @FindBy(xpath = "//input[@name='accountname']") WebElement organizationName;
	private @FindBy(name = "industry") WebElement industry;
	private @FindBy(xpath = "//input[@name='button']") WebElement saveButton;

	public void organizations() {
		organizations.click();
	}

	public void plus() {
		plus.click();
	}

	public void organizationName(String name) {
		organizationName.sendKeys(name);
	}

	public void industry(String ind) {
		Select sel = new Select(industry);
		sel.selectByVisibleText(ind);
	}

	public void saveButton() {
		saveButton.click();
	}

}
