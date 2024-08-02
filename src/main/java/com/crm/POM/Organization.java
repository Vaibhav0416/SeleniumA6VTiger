package com.crm.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Organization 
{
	public Organization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "(//a[text()='Organizations'])[1]")
	WebElement org;
	
	private @FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusimg;
	
	private @FindBy(xpath = "(//a[@href='index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing'])[2]")
	WebElement creatorg;
	
	private @FindBy(xpath = "//input[@name='accountname']")
	WebElement acname;
	
	private @FindBy(xpath = "(//input[@name='button'])[1]")
	WebElement save_btn;
	
	public void org()
	{
		org.click();
	}
	public void plusimg()
	{
		plusimg.click();
	}
	public void creatorg()
	{
		creatorg.click();
	}
	public void accname(String name) 
	{
		
		acname.sendKeys(name);
	}
	public void save_btn()
	{
		save_btn.click();
	}

}