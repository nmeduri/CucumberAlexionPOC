package com.alexion.stepdefenitions;

import com.alexion.utils.BrowserSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OurInspirationTestSteps extends BrowserSetup {
	@Before
	public void setUp() {
		System.out.println("Starting OurInspiration Scenario Execution.....");
	}

	@Given("^User Alexion WebPage$")
	public void user_Alexion_WebPage() {
		BrowserSetup.launchBrowser();
	}

	@When("^User clik on Our Inspiration Link$")
	public void user_clik_on_Our_Inspiration_Link() throws InterruptedException {
		BrowserSetup.ourInspirationLink();
	}

	@Then("^Our Inspiration Link should display$")
	public void our_Inspiration_Link_should_display() {
		BrowserSetup.closeBrowser();
		System.out.println("OurInspiration Successfully Executed....");
	}
	
	@After
	public void tearDown() {
		System.out.println(" OurInspiration Scenario Execution Completed Successfully.....");
	}

}
