Feature: Login

  In order to perform successful login
  As a user
  I want to enter correct username and password

Scenario: In order to verify login to facebook
  Given user navigates to facebook website
  When user validates the homepage title
  Then user enter the username
  And user enter the password
  Then user should be succesfully logged in