@sev2
Feature: Add mention by clicking on the add mention icon.

  Background:
    Given the user successfully navigates to the Homepage.

  Scenario: Adding mention
    When the user clicks Poll tab on the homepage.
    And the user clicks on the Add mention.
    And the user selects by clicking on employees from Recent.
    Then verify selected users both on Message Title and To sections.
