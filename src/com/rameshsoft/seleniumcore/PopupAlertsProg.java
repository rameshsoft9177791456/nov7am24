package com.rameshsoft.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlertsProg {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	
	driver.get("file:///C:/Users/RAMESHSOFT/Desktop/Desktop/alerts4/WindowUploadfile.html");
	
	driver.findElement(By.id("1")).sendKeys("C:\\Users\\RAMESHSOFT\\Desktop\\salary.txt");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
	
	Alert alert = driver.switchTo().alert();
	
	String txt = alert.getText();
	System.out.println(txt);
	
	alert.sendKeys("rameshsoft");
	
	alert.accept();*/
	
	Thread.sleep(5000);
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
}
}
