package com.alexion.stepdefenitions;

import com.alexion.utils.BrowserSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OurResearchLinkTestSteps extends BrowserSetup {

	@Before
	public void setUp() {
		System.out.println("Starting OurResearchLink Scenario Execution.....");
	}
	@Given("^User launched Alexion WebPage$")
	public void userlaunchedAlexionPage() {
		BrowserSetup.launchBrowser();
	}

	@When("User clik on Our Research Link")
	public void userclickResearchlink() throws InterruptedException {
		BrowserSetup.clickOurResearchLink();
	}

	@Then("Our Research Link should display")
	public void ourResearchlinkDisplay() {
		BrowserSetup.closeBrowser();
		
	}
	@After
	public void tearDown() {
		System.out.println(" OurResearchLink Scenario Execution Completed Successfully......");
	}
}
