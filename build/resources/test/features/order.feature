Feature: As test analyst
  I want to perform tests in the orders module
  To validate its correct operation

  Scenario: place a new order
    Given Sebastian entered the section to enter a new order
    When you fill out the form
      | customer          | employee      | product | shipVia        | freight | shipName         | shipAddress     | shipCity | shipRegion | shipCountry |
      | Familia Arquibaldo| Nancy Davolio | Chang   | Speedy Express | 15.25   | Sebastian Osorio | calle 82 #78-25 | Medellin | Antioquia  | Colombia    |
    Then the created order will be displayed on the screen