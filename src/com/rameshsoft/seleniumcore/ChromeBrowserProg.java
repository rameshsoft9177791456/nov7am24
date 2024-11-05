package com.rameshsoft.seleniumcore;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowserProg {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(4, TimeUnit.MINUTES);
	
	Options options = driver.manage();
	Timeouts timeouts = options.timeouts();
	timeouts.implicitlyWait(2, TimeUnit.MINUTES);
	
	driver.get("https://www.gmail.com");
	
	WebElement un = driver.findElement(By.id("identifierId"));
	un.clear();
	un.sendKeys("rameshsoft.9177791456");
	
	Thread.sleep(5000);
	
	WebDriverWait wait = new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.attributeContains(By.id("identifierId"), "name", "identifier"));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("identifierNext"))));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("identifierNext"))));
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	nxt.click();
	
	wait.until(ExpectedConditions.attributeToBe(nxt, "id", "identifierNext"));
	
	String curUrl = driver.getCurrentUrl();
	System.out.println("URL is: "+curUrl);
	
	String actTitle = driver.getTitle();
	System.out.println("Title is: "+actTitle);
	
	String curWinName = driver.getWindowHandle();
	System.out.println(curWinName);
	
	Set<String> windows = driver.getWindowHandles();
	System.out.println(windows);
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
}
}

