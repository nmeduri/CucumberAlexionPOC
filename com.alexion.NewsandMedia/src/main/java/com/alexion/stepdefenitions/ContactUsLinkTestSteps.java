package com.alexion.stepdefenitions;

import com.alexion.utils.BrowserSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsLinkTestSteps extends BrowserSetup {

	public static final String FIRST_NAME = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_1__Value']";
	public static final String LAST_NAME = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_2__Value']";
	public static final String E_MAIL = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_3__Value']";
	public static final String AREAOF_INT = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_14__Value']";
	public static final String PROD_ID = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_15__Value']";
	public static final String INQ_ID = "//textarea[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_16__Value']";
	public static final String CONTACT_LINK = "Alexion.com/EthicsHotline";
	public static final String MINFO_LINK = "a[href*='/contact-alexion'][class*=link]";

	@Before
	public void setUp() {
		System.out.println("Starting ContactUsLink Scenario Execution.....");
	}
	@Given("^User is on Alexion HomePage$")
	public void userHomePage() {
		BrowserSetup.launchBrowser();
	}

	@When("^User  click on ContactUs Link$")
	public void userclickContactUsLink() {
		BrowserSetup.clickContactUsLink();
	}

	@Then("^ContactUs screen shoud display$")
	public void contactus_screenDisplay() {
		BrowserSetup.assertLink(CONTACT_LINK);
	}

	@When("^User  click on MedicalInformation Link$")
	public void userclickMedicalInformationLink() {
		BrowserSetup.clickMedicalInfoLink();
	}

	@Then("^User enters \"([^\"]*)\" in the firstname field$")
	public void userentersFirstname(String firstname) {
		BrowserSetup.enterTextBox(FIRST_NAME, firstname);
	}

	@Then("^User enters \"([^\"]*)\" in the lastname field$")
	public void userentersLastname(String lastname) {
		BrowserSetup.enterTextBox(LAST_NAME, lastname);
	}

	@Then("^User enters \"([^\"]*)\" in the email field$")
	public void userentersEmail(String email) {
		BrowserSetup.enterTextBox(E_MAIL, email);
	}

	@Then("^User selects country from dropdown$")
	public void userselectsCountry() {
		BrowserSetup.selectDropdown();
	}

	@Then("^User enters \"([^\"]*)\" in area of interest filed$")
	public void userentersAreaofInterest(String areaOfinterest) {
		BrowserSetup.enterTextBox(AREAOF_INT, areaOfinterest);
	}

	@Then("^User enters \"([^\"]*)\" in the product field$")
	public void userentersProduct(String product) {
		BrowserSetup.enterTextBox(PROD_ID, product);
	}

	@Then("^User enters  \"([^\"]*)\" in inquiry$")
	public void userentersInquiry(String inquiry) {
		BrowserSetup.enterTextBox(INQ_ID, inquiry);
	}

	@Then("^User click on submit button$")
	public void userclickSubmit() {
		BrowserSetup.closeBrowser();
		
	}
	@After
	public void tearDown() {
		System.out.println(" ContactUsLink Scenario Execution Completed Successfully.....");
		
	}
}
