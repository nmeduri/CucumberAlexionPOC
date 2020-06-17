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
	public void user_launched_Alexion_WebPage() {
		BrowserSetup.launchBrowser();
	}

	@When("User clik on Our Research Link")
	public void user_clik_on_Our_Research_Link() throws InterruptedException {
		BrowserSetup.clickOurResearchLink();
	}

	@Then("Our Research Link should display")
	public void our_Research_Link_should_display() {
		BrowserSetup.closeBrowser();
		System.out.println("OurResearch Feature Successfully Executed....");
	}
	@After
	public void tearDown() {
		System.out.println(" OurResearchLink Scenario Execution Completed Successfully......");
	}
}
