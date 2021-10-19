package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tester2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\New Folder (3)\\Browserlaunch\\drivers'\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String t = driver.getTitle();
		System.out.println("current title page:"+t);
		
		String cu = driver.getCurrentUrl();
		System.out.println("current url page:"+cu);
		
		driver.close();
	}

}
