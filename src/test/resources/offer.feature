
Feature: Give the Discount based on amount spent


  Scenario: verify 10% offer
    Given Execute DiscountService Business
    When amount is 5001
    Then The discount is ten percentage

  Scenario: verify 15% offer
    Given Execute DiscountService Business
    When amount is 10001
    Then The discount is fifteen percent
