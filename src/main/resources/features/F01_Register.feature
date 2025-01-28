@smoke
Feature: "F01_Register | user could register with new accounts

  Background: the browser ist opened and URL is navigated

  Scenario Outline: Guest could register with valid data successfully

    When User clicks on register icon
    And User chooses gender
    And User enters first name "<fistName>"
    And User enters last name "<lastName>"
    And User select the date od birth
    And User enters email
    And User enters company name
    And User enters password and confirm
    And User clicks on register button
    Then the account is crated
    Examples:
      | fistName | lastName |
      | Mohammed | Azzam    |

