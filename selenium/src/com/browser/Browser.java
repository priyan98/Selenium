package com.browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sangeeth priyan R\\eclipse-workspace\\selenium\\Driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	
		driver.get("https://www.youtube.co.in");
		 driver.manage().window().maximize();
                         Dimension d = new Dimension(1000,1000);
                         driver.manage().window().setSize(d);
    Thread.sleep(3000);
	 driver. navigate().to("https://www.amazon.in");
	             String title = driver.getTitle();
         	     System.out.println("Current title:"+title);
                 String currenturl =driver.getCurrentUrl();
         	     System.out.println("Current url:"+currenturl);  
  Thread.sleep(3000);


    driver.navigate().back();
                 String title1 = driver.getTitle();
	             System.out.println("Current title:"+title1);
                 String currenturl1 =driver.getCurrentUrl();
 
 Thread.sleep(3000);
 
	driver.navigate().forward();
	           String title2 = driver.getTitle();
	           System.out.println("Current title:"+title2);
	           String currenturl3 =driver.getCurrentUrl();
 
 driver.navigate().refresh();
	driver.quit();	
		}

}
