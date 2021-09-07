package com.telecom.stepdefinition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.telecom.resources.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{
	public static WebDriver drivers;
	
	CommonActions ca = new CommonActions();
	
	@Before
	public void beforescenario(){
		ca.browserlaunch("http://www.demo.guru99.com/telecom/");		
			}
	
	@After
	public void afterscenario(Scenario scenario) {
		//driver.quit();
		if(scenario.isFailed()){

			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}else{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");

		}
		
	}
	
}
