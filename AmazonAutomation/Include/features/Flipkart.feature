Feature: Place Order on Flipkart

  Scenario: Successful Order Placement
    Given I am a registered user on Flipkart
    And I am logged in to my account
    When I search for "Samsung Galaxy S21"
    And I select the first search result
    And I choose the "128GB/8GB RAM" variant
    And I add the product to my cart
    And I proceed to checkout
    And I enter my shipping address
    And I select "Cash on Delivery" as the payment method
    And I review the order details
    And I confirm the order
    Then I should see a success message
    And I should receive an order confirmation email

 

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |