package com.browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Caps {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sangeeth priyan R\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//caps on========================================================	
    Robot a = new Robot();
	a.keyPress(KeyEvent.VK_CAPS_LOCK);
	a.keyRelease(KeyEvent.VK_CAPS_LOCK);
	WebElement r = dr.findElement(By.id("twotabsearchtextbox"));
	Thread.sleep(8000);
	dr.findElement(By.xpath("//input[@type='submit']")).click(); 
	System.out.println(dr.getCurrentUrl());
    a.keyPress(KeyEvent.VK_CAPS_LOCK);  
    a.keyRelease(KeyEvent.VK_CAPS_LOCK);
//Multi taps=========================================================================	
    WebElement am = dr.findElement(By.xpath("//a[text()='Amazon miniTV']"));
    Actions action = new Actions(dr);
	action.moveToElement(am).contextClick(am).perform();
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	
    WebElement bs = dr.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
	action.moveToElement(bs).contextClick(bs).perform();
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	
    WebElement mo = dr.findElement(By.xpath("//a[text()='Mobiles']"));
	action.moveToElement(mo).contextClick(mo).perform();
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
}
}