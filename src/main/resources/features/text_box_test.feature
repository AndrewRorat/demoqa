Feature: I want to test Text box page;

  Background: User navigates to DemoQA homePage
    Given I am on the home page on URL "https://www.demoqa.com/"

  Scenario: Register user with
    When I go to the Text box page
    And I input name "Mark"
    And I input email address "markus@gmail.com"
    And I input current address "lviv"
    And I click Submit button
    Then I see "Mark", "markus@gmail.com" in output information under the registration form