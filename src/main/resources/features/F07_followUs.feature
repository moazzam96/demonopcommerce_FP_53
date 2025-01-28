@smoke
Feature: User could navigate to social networks (Facebook, Twitter, RSS, Youtube)

  Scenario: User could open Facebook link
    When User click on FacebookIcon
    Then User should be directed to Facebook Website

  Scenario: User could open Twitter link
    When User click on TwitterIcon
    Then User should be directed to Twitter Website

  Scenario: User could open RSS link
    When User click on RSSIcon
    Then User should be directed to RSS Website

  Scenario: User could open YouTube link
    When User click on YouTubeIcon
    Then User should be directed to YouTube Website