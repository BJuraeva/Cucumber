Feature: Login related scenarios

  Background:
    #Given user is navigated to HRMS application ==> we have it in Hooks class

  @smoke @sprint1 @newTestCase @NewFeature @login
  Scenario: Valid amin login
    # don't add anything in the steps after creating LoginStep class(step definition)
    # Given user is navigated to HRMS application
    When user enter valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application

    # we are writing only  declaration then in java class we will have out definition
    # link with LoginSteps right click-> Go to-> Declaration or Usage
    # we can run only Feature file not the steps

  @employee @sprint1
  Scenario: valid ass login
    # Given user is navigated to HRMS application
    When user enters ess username and password
    And user clicks on login button
    Then user is successfully logged in the application

  @invalid @sprint1
  Scenario: invalid admin login
    # Given user is navigated to HRMS application
    When user enters invalid admin username and password
    And user clicks on login button
    Then error message is displayed