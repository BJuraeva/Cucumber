Feature: Login related scenarios
  Scenario: Valid amin login
    Given user is navigated to HRMS application
    When user enter valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    