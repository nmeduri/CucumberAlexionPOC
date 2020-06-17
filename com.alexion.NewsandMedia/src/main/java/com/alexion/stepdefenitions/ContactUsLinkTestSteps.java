package com.alexion.stepdefenitions;

import com.alexion.utils.BrowserSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsLinkTestSteps extends BrowserSetup {

	public String fName = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_1__Value']";
	public String lName = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_2__Value']";
	public String e_mail = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_3__Value']";
	public String areaofInt = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_14__Value']";
	public String prod = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_15__Value']";
	public String inq = "//textarea[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_16__Value']";
	public String contlink = "Alexion.com/EthicsHotline";
	public String minfolink = "a[href*='/contact-alexion'][class*=link]";

	@Before
	public void setUp() {
		System.out.println("Starting ContactUsLink Scenario Execution.....");
	}
	@Given("^User is on Alexion HomePage$")
	public void user_is_on_Alexion_HomePage() {
		BrowserSetup.launchBrowser();
	}

	@When("^User  click on ContactUs Link$")
	public void user_click_on_ContactUs_Link() {
		BrowserSetup.clickContactUsLink();
	}

	@Then("^ContactUs screen shoud display$")
	public void contactus_screen_shoud_display() {
		BrowserSetup.assertLink(contlink);
	}

	@When("^User  click on MedicalInformation Link$")
	public void user_click_on_MedicalInformation_Link() {
		BrowserSetup.clickMedicalInfoLink();
	}

	@Then("^User enters \"([^\"]*)\" in the firstname field$")
	public void user_enters_in_the_firstname_field(String firstname) {
		BrowserSetup.enterTextBox(fName, firstname);
	}

	@Then("^User enters \"([^\"]*)\" in the lastname field$")
	public void user_enters_in_the_lastname_field(String lastname) {
		BrowserSetup.enterTextBox(lName, lastname);
	}

	@Then("^User enters \"([^\"]*)\" in the email field$")
	public void user_enters_in_the_email_field(String email) {
		BrowserSetup.enterTextBox(e_mail, email);
	}

	@Then("^User selects country from dropdown$")
	public void user_selects_country_from_dropdown() {
		BrowserSetup.selectDropdown();
	}

	@Then("^User enters \"([^\"]*)\" in area of interest filed$")
	public void user_enters_in_area_of_interest_filed(String areaOfinterest) {
		BrowserSetup.enterTextBox(areaofInt, areaOfinterest);
	}

	@Then("^User enters \"([^\"]*)\" in the product field$")
	public void user_enters_in_the_product_field(String product) {
		BrowserSetup.enterTextBox(prod, product);
	}

	@Then("^User enters  \"([^\"]*)\" in inquiry$")
	public void user_enters_in_inquiry(String inquiry) {
		BrowserSetup.enterTextBox(inq, inquiry);
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button() {
		BrowserSetup.closeBrowser();
		System.out.println("Contact Us Feature Successfully Executed....");
	}
	@After
	public void tearDown() {
		System.out.println(" ContactUsLink Scenario Execution Completed Successfully.....");
		
	}
}
