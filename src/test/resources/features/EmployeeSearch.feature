
Feature: Search an employee

  Background:
    # Given user is navigated to HRMS application ==> we have in Hooks class (steps package)
    When user enter valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user click on PIM option and Employee list option

  @smoke @regression @sprint3 @background
  Scenario: Search employee by id
    And  user enters valid employee id
    And  user click on search button
    Then user is able to see employee information

   @smoke @regression @sprint2 @background
  Scenario: Search employee by name
    And user enters valid employee name in name text box
    And user click on search button
    Then user is able to see employee information
