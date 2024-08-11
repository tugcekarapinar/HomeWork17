Feature: Add Record Test
  Scenario: User adds a record and edits it
    Given For Web Tables Page webDriver is set and configuration settings are made
    When User navigates to the web tables page
    And User clicks on the Add button
    And User enters "Demir Ege" as first name, "Karapinar" as last name, "demiregekarapinar@gmail.com" as email, "0" as age, "100000" as salary, and "bebek" as department
    And User clicks on the Submit button
    And User clicks the "Demir Ege"'s Edit button
    And User enters new value "200000" as salary
    And User clicks on the Submit button
    Then User should see the "Demir Ege"'s salary value is edited as new salary value "200000"