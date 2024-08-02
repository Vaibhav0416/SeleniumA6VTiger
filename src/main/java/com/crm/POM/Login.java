package com.crm.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.FileUtility.ReadProperties;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	private @FindBy(xpath = "//input[@name='user_name']") WebElement userName;

	private @FindBy(xpath = "//input[@name='user_password']") WebElement password;
	private @FindBy(id = "submitButton") WebElement logInButton;
	
	public void userName(String uName) throws IOException {
		
		userName.sendKeys(uName);
	}

	public void password(String pass) throws IOException {
		
		password.sendKeys(pass);
	}

	public void logInButton() {
		logInButton.click();
	}

}
