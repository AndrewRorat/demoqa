Feature: I want to test Checkbox page;

  Background: User navigates to DemoQA homePage
    Given I am on the home page on URL "https://www.demoqa.com/"

  Scenario: Check Angular, veu checkboxes
    When I go to the Check Box page
    And I check "Angular" and "Veu" checkbox
    Then I see "Angular", "Veu" in output information field