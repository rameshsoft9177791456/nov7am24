package com.rameshsoft.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleProg {
WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.out.println("BS");
		System.setProperty("webdriver.chrome.driver", "D:\\jan8ambatch2023\\secondproj\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	@Test
	public void gmailTest() throws InterruptedException {
		System.out.println("@Test");
		driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.name("identifier"));
		//2. perform the action
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
		
		WebElement nxt = driver.findElement(By.id("identifierNext"));
	    nxt.click();
		
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("AS");
		driver.close();
	}
}
