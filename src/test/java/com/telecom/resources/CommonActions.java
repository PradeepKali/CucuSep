package com.telecom.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommonActions {
	
	public static WebDriver driver;
	
	public void browserlaunch(String url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADVENTURES200\\eclipse-workspace\\MvnProjects\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	}
	public void insertvalue(WebElement ele , String value) {
		ele.sendKeys(value);
	}
    public void buttonclick(WebElement ele) {
    	ele.click();
    }
}
