package com.alexion.testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources",
		glue = "com.alexion.stepdefenitions",
		monochrome = true,
		plugin = {
				"pretty", "html:target/html/AlexionSanity.html", "json:target/json/AlexionSanity.json",
				"junit:target/junit/AlexionSanity.xml", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

	public static void writeExtentReport() {

	}
}