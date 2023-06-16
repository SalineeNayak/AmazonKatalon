Feature: Amazon Shopping

Scenario: Search and Add to Cart
  Given User opens the Amazon website
  When User maximizes the window
  And User clicks on the "All" menu
  And User scrolls to the "Sign In" element
  And User closes the "Sign In" popup
  And User enters "pen" in the search bar
  And User presses Enter to perform the search
  And User verifies that the checkbox is not checked
  And User clicks on the checkbox
  And User waits for a pen item to be visible
  And User clicks on the pen item
  And User switches to the new window
  And User waits for the "Add to Cart" button to be present
  And User clicks on the "Add to Cart" button
  And User waits for the "Proceed to Checkout" button to be visible
  And User clicks on the "Proceed to Checkout" button
  Then User should proceed to the checkout process