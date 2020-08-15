Feature: I want to test Text box page;

  Background: User navigates to DemoQA homePage
    Given I am on the home page on URL "https://www.demoqa.com/"

  Scenario: Register user with correct credentials
    When I go to the Text box page
    And I input correct first name
    And I input correct email address
    And I input current address
    And I click Submit button
    Then I see "user" output information under the registration form