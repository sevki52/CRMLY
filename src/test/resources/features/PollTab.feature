
Feature: Selecting multiple contacts

  Background:
    Given the user successfully navigates to the Homepage
  @CRMLYEUG-819
  Scenario: Selecting multiple contacts.
    Then the user is on home page
    When the user clicks Poll tab on the homepage
    And the user  clicks All employees under the pool tab
    And the user clicks on employees and departments on the right side
    And the user selects multiple contacts from Employees and Departments contact lists
    And the user closes the contact lists window
    Then verify the contacts in the employee box
      | hr80@cybertekschool.com |
      | helpdesk23@cybertekschool.com |
      | helpdesk24@cybertekschool.com |


