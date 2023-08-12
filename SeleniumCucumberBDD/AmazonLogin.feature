@Amazon
Feature: Amazon

  @Amazon_Login
  Scenario: To verify user able to Navigate amazon
    Given I want to Launch a webdriver and navigate to AmazonURL
    When Click on search option button
    When enter product "name" in search box
    Then I want to exit the webdriver
