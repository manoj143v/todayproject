package org.edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fliptester {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\New Folder (3)\\Browserlaunch\\drivers'\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
			driver.get("https://www.flipkart.com/");

		String t = driver.getTitle();
		System.out.println("current title page:"+t);
		
		String cu = driver.getCurrentUrl();
		System.out.println("current page url:"+cu);
		
		driver.close();
	}
}
