package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbtester {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "F:\\New Folder (3)\\firefox\\drivers'\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	String t = driver.getTitle();
	System.out.println("current title page:"+t);
	
	String cu = driver.getCurrentUrl();
	System.out.println("current page url:"+cu);
	
	driver.close();
}
}
