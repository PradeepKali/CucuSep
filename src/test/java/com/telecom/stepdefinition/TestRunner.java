package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//src/test/resources",//has given empty path its runs all features
		glue = "com.telecom.stepdefinition",
		plugin = "html:target",
		monochrome = true,
		dryRun = false
        
		)

public class TestRunner {

}
