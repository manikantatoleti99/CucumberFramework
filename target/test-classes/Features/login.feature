Feature: Login function
@Login
  Scenario: Validate login flow
    Given user is on login page
    When Login with username and Password
    And Click signIn button
    Then Validate user is on login page
  
