package com.rameshsoft.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	
	//1. identify the element
	//WebElement un = driver.findElement(By.id("identifierId"));
	WebElement un = driver.findElement(By.ById.id("identifierId"));
	
	//2. perform the action
	un.clear();
	un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	Thread.sleep(5000);
	
	//1. identify the element
	//WebElement nxt = driver.findElement(By.id("identifierNext"));
	WebElement nxt = driver.findElement(By.ById.id("identifierNext"));
	
	//2. perform the action
	nxt.click();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
	
	
}
}
