Feature: Click Button Test
  Scenario: User clicks the button and sees the message
    Given For Elements Page webDriver is set and configuration settings are made
    When User navigates to the elements page
    And User clicks on the Buttons option
    And User clicks the Click Me button
    Then User should see the message "You have done a dynamic click"