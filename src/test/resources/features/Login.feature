Feature: Login related scenarios
  Scenario: Valid amin login
    # don't add anything in the steps after creating LoginStep class
    Given user is navigated to HRMS application
    When user enter valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application

    # we are writing only  declaration then in java class we will have out definition
    # link with LoginSteps right click-> Go to-> Declaration or Usage