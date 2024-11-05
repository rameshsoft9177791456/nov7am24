package com.rameshsoft.java.automation.collframework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollectionsProg3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.adp.com");
	
	WebElement dd = driver.findElement(By.id("456"));
	
	Select select = new Select(dd);
	
	List list = select.getOptions();
	System.out.println("Noof elements : "+list.size());
	
	Set set = new HashSet();
	
	for(int i=0; i<list.size(); i++)
	{
		Object obj = list.get(i);
		set.add(obj);
	}
	
	System.out.println(set);
	
	
	
	
	
	
	
	
	
	
}
}
