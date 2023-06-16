Feature: Amazon Shopping

Scenario: User Login
  Given User opens the Amazon website
  When User clicks on the "Sign In" button
  And User enters the username 
  And User clicks on the "Continue" button
  And User enters the encrypted password
  And User clicks on the "Sign In" button
  Then User should navigate to homepage
  
 
  |username | password |
  |soubhagya.fukuli@gmail.com | vshmLYV0ToJUwW6s7TkGWw==|



