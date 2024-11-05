package com.rameshsoft.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Job {

WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.out.println("BS");
		System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	@Test(invocationCount=5,invocationTimeOut=9000)
	public void gmailTest() throws InterruptedException {
		System.out.println("@Test: gmailTest");
		driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.name("identifier"));
		//2. perform the action
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
		
		WebElement nxt = driver.findElement(By.id("identifierNext"));
	    nxt.click();
		
		Thread.sleep(5000);
	}
	@Test(timeOut=5000)
	public void abc() {
		System.out.println("@Test: abc");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AM");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("AS");
		driver.close();
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BT");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AT");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BC");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AC");
	}
	@Test
	public void hardwork() {
		System.out.println("@Test: hardwork");
	}
}
