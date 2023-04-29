package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",  "C:\\Users\\sangeeth priyan R\\eclipse-workspace\\selenium\\Driver2\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Badminton");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Point");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("oviyamkavi@gmail.com");
	Thread.sleep(4000);
	 driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("oviyamkavi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Gpmuthu");
	
	Thread.sleep(2000);
	WebElement dateElement= driver. findElement(By.id("day"));
	Select datedropdown = new Select(dateElement);
	datedropdown.selectByVisibleText("1");
	Thread.sleep(2000);
	WebElement monthElement = driver.findElement(By.id("month"));
	Select monthdropdown = new Select(monthElement);
	monthdropdown.selectByVisibleText("Feb");
	Thread.sleep(2000);
	WebElement yearElement = driver.findElement(By.id("year"));
	Select yeardropdown = new Select(yearElement);
	yeardropdown.selectByVisibleText("1997");

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("websubmit")).click();

	driver.findElement(By.name("(//div[@data-visualcompletion='ignore'])[3]")).click();
	}
}
