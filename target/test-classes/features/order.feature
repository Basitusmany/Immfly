Feature: Web table user order feature

  @wip
  Scenario: User should be able to place order and order seen in web table

    Given user is already logged in to web table app
    When user select product type "Familybea"
    And user enters Quantity "2"
    And user enters Customer name "Sherlock Holmes"
    And user enters Street "221B Baker Street"
    And user enters City "London"
    And user enters State "England"
    And user enters  Zip "50505"
    And user selects credit card type "visa"
    And user enters credit card number "111222336665544477"
    And user enters expiry date "12/23"
    And user clicks to Process Order button
    Then user should see "Sherlock Holmes" in first row of the web table

  Scenario Template: User should be able to place order and order seen in web table

    Given user is already logged in to web table app
    When user select product type "<productType>"
    And user enters Quantity "<Quantity>"
    And user enters Customer name "<CustomerName>"
    And user enters Street "<street>"
    And user enters City "<City>"
    And user enters State "<State>"
    And user enters  Zip "<Zip>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expiryDate>"
    And user clicks to Process Order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientists
    Examples: Famous female scientists

      | productType | Quantity | CustomerName | street    | City   | State   | Zip   | cardType | cardNumber     | expiryDate | expectedName |
      | MoneyCog    | 1        | Mursal       | London st | London | England | 12345 | Visa     | 32145698711123 | 12/27      | Mursal       |
      | Familybea   | 2        | Maryam       | London st | London | England | 12345 | Visa     | 32145698711321 | 12/27      | Maryam       |
      | Screenable  | 3        | Zuhal        | London st | London | England | 12345 | Visa     | 32145698711159 | 12/27      | Zuhal        |
      | MoneyCog    | 4        | Oranus       | London st | London | England | 12345 | Visa     | 32145698711987 | 12/27      | Oranus       |
      | Familybea   | 5        | Fatima       | London st | London | England | 12345 | Visa     | 32145698711753 | 12/27      | Fatima       |



