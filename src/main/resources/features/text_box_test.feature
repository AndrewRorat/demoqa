Feature: I want to test Text box page;

  Background: User navigates to DemoQA homePage
    Given I am on the home page on URL "https://www.demoqa.com/"

  Scenario: Register user
    When I go to the Text box page
    * I input name "Mark"
    * I input email address "markus@gmail.com"
    * I input current address "lviv"
    * I click Submit button
    Then I see "Mark", "markus@gmail.com" in output information under the registration form