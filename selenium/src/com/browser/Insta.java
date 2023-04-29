package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Insta {



public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",  "C:\\Users\\sangeeth priyan R\\eclipse-workspace\\selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();

	Thread.sleep(2000);
	/*WebElement email = driver.findElement(By.name("username"));
			email.sendKeys("sangeethpriyanmnm@gmail.com");
			Thread.sleep(2000);
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("Shuttle@15");
			
			WebElement login = driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div"));
			login.click();
			Thread.sleep(4000);
			WebElement not_now = driver.findElement(By.xpath("//*[text()='Not Now']"));
			not_now .click();*/
		
		//	//button[@class='_a9-- _a9_1']
	WebElement email=driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input"));
	email.sendKeys("sangeethpriyanmnm@gmail.com");
	Thread.sleep(2000);
	WebElement pass=driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input"));
	pass.sendKeys("Shuttle@15");
	
	WebElement login = driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]"));
	login.click();
	Thread.sleep(4000);
	
	WebElement notnow = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div/div/button"));
	notnow.click();
	Thread.sleep(4000);

			
			
	WebElement Notification = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]"));
			Notification .click();
			
			 driver.findElement(By.xpath("(//div[@class='_acut'])[2]")).click();
		
			
}


	



	
}

