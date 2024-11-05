package com.rameshsoft.seleniumcore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\July9am2024\\secondapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	//driver.navigate().to("https://www.gmail.com");
	//URL url = new URL("https://www.gmail.com");
	//driver.navigate().to(url);
	
	//Navigation navigation = driver.navigate();
	//navigation.to("https://www.gmail.com");
	
	//Uisng JavascriptExecutor 
	
	WebElement un = driver.findElement(By.id("identifierId"));
	//un.clear();
	//un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	Actions actions = new Actions(driver);
	//actions.sendKeys("rameshsoft.9177791456@gmail.com").build().perform();
	//actions.sendKeys("rameshsoft.9177791456@gmail.com").perform();
	
	//actions.click(un).sendKeys("rameshsoft.9177791456@gmail.com").build().perform();
	/*Actions actions2 = actions.click(un);
	Actions actions3 = actions2.sendKeys("rameshsoft.9177791456");
	Action action = actions3.build();
	action.perform();*/
	
	actions.sendKeys(un, "rameshsoft.9177791456").build().perform();
	//Uisng JavascriptExecutor 
	//Using Robot class
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	nxt.click();
	//actions.click(nxt).build().perform();
	//actions.doubleClick(nxt).build().perform();
	//actions.sendKeys(nxt, Keys.ENTER).build().perform();
	//Uisng JavascriptExecutor 
	//Using Robot class
	
	actions.sendKeys(Keys.END).build().perform();
	actions.sendKeys(Keys.HOME).build().perform();
	
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
	actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT).build().perform();
	
	//ctrl + a ctrl + t ctrl + s ctrl + d
	//ctrl + shift + a ......
	
	actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
	
	Thread.sleep(5000);
	
	driver.get("https://www.amazon.in/");
	
	WebElement eng = driver.findElement(By.xpath("//div[text()='EN']"));
	
	actions.moveToElement(eng).build().perform();
	
	
	
	
	
	
	
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
