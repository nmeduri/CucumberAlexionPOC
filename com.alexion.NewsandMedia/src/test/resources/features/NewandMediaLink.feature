Feature: News&Media Link Function

  Scenario: Verify News&Media Link Function
    Given User is on Alexion Home Page
    When User  click on NEWS&MEDIA Link
    Then NEWS&MEDIA page should be displayed
    And User selects option from NEWS CATEGORY dropdown and Year from YEAR dropdown
    When User click on Filter button
    Then User selected Year News should be displayed on the same page