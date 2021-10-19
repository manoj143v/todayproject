package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\New Folder (3)\\Browserlaunch\\drivers'\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String t = driver.getTitle();
		System.out.println("current title page:"+t);
		
		String cu = driver.getCurrentUrl();
		System.out.println("current url page:"+cu);
		
		driver.close();
	}

}
