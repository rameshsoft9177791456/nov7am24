package com.rameshsoft.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutorProg {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	
	WebElement un = driver.findElement(By.id("identifierId"));
	
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	javascriptExecutor.executeAsyncScript("arguments[0].value='rameshsoft.9177791456';", un);
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	javascriptExecutor.executeScript("arguments[0].click();", nxt);
	
	
	javascriptExecutor.executeScript("window.location='https://www.rameshsoft.com'");
	
	String domainName = javascriptExecutor.executeScript("return document.domain;").toString();
	System.out.println("Domain name is: "+domainName);
	
	String url = javascriptExecutor.executeScript("return document.URL;").toString();
	System.out.println("URL is: "+url);
	
	String titleName = javascriptExecutor.executeScript("return document.title;").toString();
	System.out.println("Domain name is: "+titleName);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
