package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gulnoza/Documents/selenium dependencies/drivers/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:/Users/Gulnoza/Documents/selenium dependencies/drivers/geckodriver.exe");
//		System.setProperty("webdriver.edge.driver", "C:/Users/Gulnoza/Documents/selenium dependencies/drivers/MicrosoftWebDriver.exe");
//		System.setProperty("webdriver.ie.driver", "C:/Users/Gulnoza/Documents/selenium dependencies/drivers/IEDriverServer.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.cybertekschool.com");
		driver.close();

	}

}

        
        
        