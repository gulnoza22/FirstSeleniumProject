package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gulnoza/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.etsy.com/search?q=wooden%20spoon&ref=auto2&as_prefix=wooden%20s");

	}

}
