package com.crm.Baseclass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.FileUtility.ReadProperties;
import com.crm.POM.Login;

public class VtigerBaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void preCondition() throws IOException
	{
		String browser=ReadProperties.loginData("browser");
		 String url=ReadProperties.loginData("url");
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		
		else {
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException 
	{
		String expected_result = "http://localhost:8888/";
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
		String username = ReadProperties.loginData("username");
		String password = ReadProperties.loginData("password");
		Login log = new Login(driver);
		log.userName(username);
		log.password(password);
		log.logInButton();
	

	}
	
	@AfterMethod
	public void logOut() 
	{
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}

}
