package com.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrderExample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sangeeth priyan R\\eclipse-workspace\\selenium\\Driver2\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[.='✕']")).click();
		//	WebElement login = driver.findElement(By.linkText("Login"));
		//	Actions ac = new Actions(driver);
		//	ac.moveToElement(login).perform();
		//	driver.findElement(By.xpath("//div[.='Sign Up']")).click();
		//  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7867899689");
		//	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//	driver.findElement(By.xpath("//input[@autocomplete='on']")).sendKeys("614591");
		//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gpmuthu");
		//	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7867899689");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gpmuthu");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
// TO ACCESS MY ACCOUNT PAGE........		
	/*	Thread.sleep(2000);
		WebElement myAcc = driver.findElement(By.xpath("(//div[.='peachpeach'])[5]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(myAcc).build().perform();
		Thread.sleep(3000);
		WebElement profile = driver.findElement(By.linkText("My Profile"));
		ac.click(profile).perform();
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
	
// UPDATE MY DETAILS.......
		
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.name("firstName")).sendKeys("peach");
  		driver.findElement(By.name("lastName")).sendKeys("gomma");
		driver.findElement(By.xpath("//span[.='Male']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//div[.='Manage Addresses']")).click();
		driver.findElement(By.xpath("//button[.='ADD ADDRESSES']")).click();
		driver.findElement(By.name("name")).sendKeys("siva");
		driver.findElement(By.name("phone")).sendKeys("7867899689");
		driver.findElement(By.name("pincode")).sendKeys("630606");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("municipality");
		driver.findElement(By.name("addressLine1")).sendKeys("vinayagar street, railwaycolony,");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("manamadurai/sivagangai");
		
		WebElement SS = driver.findElement(By.name("state"));
		Select SSdropdown = new Select(SS);
		SSdropdown.selectByVisibleText("Tamil Nadu");
		
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("old baba school");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("9976194273");
		driver.findElement(By.xpath("//label[@for='HOME']")).click();
		driver.findElement(By.xpath("//button[.='Save']")).click();
		driver.navigate().back();
		System.out.println("return to button page1:"+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("return to button page2:"+driver.getCurrentUrl());*/
		
		
 // ORDER PROCESS.....
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Fashion']")).click();
        WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
        Actions ac1 = new Actions(driver);
        ac1.moveToElement(men).perform();
        driver.findElement(By.xpath("//a[.='Sports Shoes']")).click();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement bruton = driver.findElement(By.xpath("(//a[contains(text(),'Trendy Sports ')])[2]"));
        js.executeScript("arguments[0].scrollIntoView();", bruton);
        
         driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[14]")).click();
         System.out.println("shoe page:"+driver.getCurrentUrl());
         
         driver.switchTo().frame(1);
         JavascriptExecutor js1 = (JavascriptExecutor)driver;
         WebElement color = driver.findElement(By.id("Color"));
         js1.executeScript("arguments[0].ScrollIntoView();", color);
         
         driver.findElement(By.xpath("//li[@id='swatch-2-size']")).click();
         driver.findElement(By.xpath("//button[@type='button']")).click();
         driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("gomma");
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7867899689");
         driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("municipality");
         driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
         driver.findElement(By.xpath("//button[.='Confirm address']")).click();
         driver.findElement(By.xpath("//input[@name='landmark']")).sendKeys("near by italiano");
         driver.findElement(By.xpath("//input[@name='alternatePhone']")).sendKeys("99761943273");
         driver.findElement(By.xpath("//label[@for='HOME']")).click();
         driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        



	}

	
		
	}




