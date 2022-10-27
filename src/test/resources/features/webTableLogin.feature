Feature: User should be able to login using correct credential


  Background:
    Given user is on the login page of web table app

  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click to login button




  Scenario: User is on the login page of Web table app
  dropdown
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then  user should see url contains "orders"

