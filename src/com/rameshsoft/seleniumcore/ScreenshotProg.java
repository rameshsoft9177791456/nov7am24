package com.rameshsoft.seleniumcore;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotProg {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	//RemoteWebDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	
	File file1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file1, new File("D:\\July9am2024\\secondapp\\Screenshots\\GmailHomePage.jpeg"));
	
	WebElement un = driver.findElement(By.id("identifierId"));
	un.clear();
	un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	File file2 = takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file2, new File("D:\\July9am2024\\secondapp\\Screenshots\\GmailHomePage_Un.jpeg"));
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
}
}
