@smoke
  #Positive
Feature: F02_Login | users could use login functionality to use their accounts

  Background: the browser ist opened and URL is navigated
  #Valid Login --> Kindly register by using the given Mail and Pass to run the 1st Scenario.

  Scenario:  user could login with valid email and password
    When user go to login page
    And  user login with valid "test@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully
#Negative
  Scenario: user could login with invalid email and password
    When user go to login page
    And user login with invalid "wrong@example.com" and "P@ssw0rd"
    And user press on login button
    Then user could not login to the system
