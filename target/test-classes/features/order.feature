Feature: Sort By functionality



  Scenario: As a user I should see position selected as a default on Sort By dropdown

    Given The user is in the product list page
    When  scroll down until the user see the Sort By dropdown
    Then The user should see the page is sorted by position as a default

  Scenario: As a user I should see four option in Sort By dropdown

    Given The user is in the product list page
    When scroll down until the user see the Sort By dropdown
    And click on Sort By dropdown
    Then The user should see the following options: "Position", "Product Name", "Price" and "New Arrivals"



