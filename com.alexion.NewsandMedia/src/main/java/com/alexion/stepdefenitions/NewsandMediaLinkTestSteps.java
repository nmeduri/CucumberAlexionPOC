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
	public void user_is_on_Alexion_Home_Page() {
		BrowserSetup.launchBrowser();
	}

	@When("^User  click on NEWS&MEDIA Link$")
	public void user_click_on_NEWS_MEDIA_Link() {
		BrowserSetup.clickLink();
	}

	@Then("^NEWS&MEDIA page should be displayed$")
	public void news_MEDIA_page_should_be_displayed() {
		BrowserSetup.assertText();
	}

	@And("^User selects option from NEWS CATEGORY dropdown and Year from YEAR dropdown$")
	public void user_selects_option_from_NEWS_CATEGORY_dropdown_and_Year_from_YEAR_dropdown()
			throws InterruptedException {
		BrowserSetup.selectOptionsFromDropdown();
	}

	@When("^User click on Filter button$")
	public void user_click_on_Filter_button() {
		BrowserSetup.clickButton();
	}

	@Then("^User selected Year News should be displayed on the same page$")
	public void user_selected_Year_News_should_be_displayed_on_the_same_page() {
		BrowserSetup.closeBrowser();
		System.out.println("NewsandMedia Feature Successfully Executed....");
	}
	@After
	public void tearDown() {
		System.out.println(" New and Media Scenario Execution Completed Successfully.....");
	}
}