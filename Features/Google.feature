Feature: Google search

  Scenario: Google search functionality

    Given I launch browser and open google url
    When I search for iphone
    Then I verify page title