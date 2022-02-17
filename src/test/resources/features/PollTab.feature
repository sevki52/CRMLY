@sev
Feature: Selecting multiple contacts

  Background:
    Given the user successfully navigates to the Homepage

  Scenario: The user selects multiple contacts from Employees and Departments contact lists.
    Then the user is on home page
    When the user clicks Poll tab on the homepage
    And the user  clicks All employees under the pool tab
    And the user clicks on employees and departments on the right side
    And the user selects multiple contacts from Employees and Departments contact lists
    And the user closes the contact lists window
    Then verify the selected contacts


