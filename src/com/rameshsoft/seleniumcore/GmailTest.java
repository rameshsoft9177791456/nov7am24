package com.rameshsoft.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	
	//1. identify the element
	WebElement un = driver.findElement(By.id("identifierId"));
	
	//2. perform the action
	un.clear();
	un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	Thread.sleep(5000);
	
	//1. identify the element
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	
	if (nxt.isDisplayed()&&nxt.isEnabled()) {
		//2. perform the action
		nxt.click();
	}
	
	
	driver.get("https://www.facebook.com");
	
	WebElement createAcc = driver.findElement(By.xpath("//a[@id='u_0_0_dP']"));
	createAcc.click();
	
	WebElement maleRadioBtn = driver.findElement(By.id("sex"));
	if (maleRadioBtn.isDisplayed()&&maleRadioBtn.isEnabled()) {
		maleRadioBtn.click();
	}
	else {
		//throw exception
		System.out.println("Radio button is not displayed");
	}
	
	if (maleRadioBtn.isSelected()) {
		System.out.println("Radio button is selected");
	}
	else {
		System.out.println("Radio button is NOT selected");
	}
	
	
	driver.get("https://www.facebook.com");
	
	WebElement dayDD = driver.findElement(By.id("day"));
	String tagName = dayDD.getTagName();
	
	if (tagName.equalsIgnoreCase("select")) {
		Select select = new Select(dayDD);
		boolean status = select.isMultiple();
		if (status) {
			System.out.println("It is a multi select drop down");
		}
		else {
			System.out.println("It is a single select drop down");
		}
		select.selectByIndex(2);
		select.selectByValue("9");
		select.selectByVisibleText("24");
		WebElement firstEl = select.getFirstSelectedOption();
		System.out.println("First selected element is: "+firstEl.getText());
		List<WebElement> ddElements = select.getOptions();
		System.out.println("Drop down elements are: "+ddElements.size());
		List<WebElement> ddSelElements = select.getAllSelectedOptions();
		System.out.println("Drop down selected elements are: "+ddSelElements.size());
	}
	else {
		List<WebElement> ddElements = driver.findElements(By.xpath("//*[@id='day']/option"));
		System.out.println("Drop down elements are: "+ddElements.size());
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='day']/option[26]"));
		ele.click();
	}
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
	
	
}
}
