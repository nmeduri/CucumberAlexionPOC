package com.alexion.stepdefenitions;

import com.alexion.utils.BrowserSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsandMediaLinkTestSteps extends BrowserSetup {

	@Before
	public void setUp() {
		System.out.println("Starting New and Media Scenario Execution.....");
	}
	
	@Given("^User is on Alexion Home Page$")
	public void userisonAlexionHomepage() {
		BrowserSetup.launchBrowser();
	}

	@When("^User  click on NEWS&MEDIA Link$")
	public void userclickonNewsandMedialink() {
		BrowserSetup.clickLink();
	}

	@Then("^NEWS&MEDIA page should be displayed$")
	public void newsandmediapageDisplayed() {
		BrowserSetup.assertText();
	}

	@And("^User selects option from NEWS CATEGORY dropdown and Year from YEAR dropdown$")
	public void userselectsCategory()
			throws InterruptedException {
		BrowserSetup.selectOptionsFromDropdown();
	}

	@When("^User click on Filter button$")
	public void userclickButton() {
		BrowserSetup.clickButton();
	}

	@Then("^User selected Year News should be displayed on the same page$")
	public void userselectsYear() {
		BrowserSetup.closeBrowser();
		
	}
	@After
	public void tearDown() {
		System.out.println(" New and Media Scenario Execution Completed Successfully.....");
		
	}
}
