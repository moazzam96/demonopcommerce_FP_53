@smoke
Feature: F04_Search | Verify search functionality is working

  Scenario Outline: User could search using product name
    When User search with product name "<ProductName>"
    Then Url is common and all products contain "<ProductName>" are shown
    Examples:
      | ProductName |
#      | book        |
      | laptop      |
      | nike        |





