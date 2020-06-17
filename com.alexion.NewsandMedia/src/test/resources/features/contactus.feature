@Important
Feature: ContactUs Link

  @Smoke
  Scenario: Verify ContactUs Link5
    Given User is on Alexion HomePage
    When User  click on ContactUs Link
    Then ContactUs screen shoud display
    When User  click on MedicalInformation Link
    And User enters "Alexion" in the firstname field
    And User enters "Pharma" in the lastname field
    And User enters "email" in the email field
    And User selects country from dropdown
    And User enters "Pharma" in area of interest filed
    And User enters "silicon" in the product field
    And User enters  "solirious" in inquiry
    Then User click on submit button

  @Smoke
  Scenario: Verify Our Inspiration Link6
    Given User Alexion WebPage
    When User clik on Our Inspiration Link
    Then Our Inspiration Link should display

  @Regression
  Scenario: Verify Our Inspiration Link7
    Given User Alexion WebPage
    When User clik on Our Inspiration Link
    Then Our Inspiration Link should display

  @Regression @Smoke
  Scenario: Verify Our Inspiration Link8
    Given User Alexion WebPage
    When User clik on Our Inspiration Link
    Then Our Inspiration Link should display
