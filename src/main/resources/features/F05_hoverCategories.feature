@smoke
Feature: F05_hoverCategories | verify hover functionality

  Scenario: Verify hover and elect sub_category
    When User select randomly from main_category
    And User hover and click randomly from sub_category
    Then User should be redirected to this sub_category


