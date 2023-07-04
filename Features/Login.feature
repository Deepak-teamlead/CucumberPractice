Feature: Login functionality

  Background:
    Given I launch browser and open application url

  Scenario: verify login functionality with valid credentials
    When I enter username in the username field
    And I enter password in the password field
    And I click on login button
    Then I navigate successfully to login page

  Scenario: verify login functionality with invalid credentials
    When I enter invalid username in the username field
    And I enter password in the password field
    And I click on login button
    Then I verify error message
