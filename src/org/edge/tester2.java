package org.edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tester2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\New Folder (3)\\Browserlaunch\\drivers'\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
			driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");

		String t = driver.getTitle();
		System.out.println("current title page:"+t);
		
		String cu = driver.getCurrentUrl();
		System.out.println("current page url:"+cu);
		
		driver.close();
	}

}
