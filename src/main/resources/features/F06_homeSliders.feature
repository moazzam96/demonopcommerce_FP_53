@smoke
Feature: F06_homeSliders | Verify that HomeSliders are clickable on home page

  Scenario: Verify the first Slider "Galaxy" and navigate info the product
    When User select on First Slider home page
    And User click on First selected Slider
    Then User should be directed into First product link

  Scenario: Verify the Second Slider "Iphone" and navigate info the product
    When User select on Second Slider home page
    And User click on Second selected Slider
    Then User should be directed into Second product link

