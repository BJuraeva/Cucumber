
Feature: Search an employee
  Scenario: Search employee by id
    Given user is navigated to HRMS application
    When user enter valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user click on PIM option and Employee list option
    And  user enters valid employee id
    And  user click on search button
    Then user is able to see employee information

  Scenario: Search employee by name
    Given user is navigated to HRMS application
    When user enter valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user click on PIM option and Employee list option
    And user enters valid employee name in name text box
    And user click on search button
    Then user is able to see employee information
