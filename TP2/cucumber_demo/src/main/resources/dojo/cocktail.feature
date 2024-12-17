Feature: Cocktail Ordering

  As a person who wants to buy a drink, I want to offer a drink to someone so that we can discuss together.

  Scenario: Creating an empty order
    Given "Romeo" who wants to buy a drink
    When "Romeo" adds 0 cocktail(s) to the order
    Then there are 0 cocktail(s) in the order

  Scenario: Adding cocktails to the order
    Given "Romeo" who wants to buy a drink
    When "Romeo" adds 3 cocktail(s) to the order
    Then there are 3 cocktail(s) in the order

