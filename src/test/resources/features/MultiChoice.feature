Feature: Delete Questions and Answers

  Background:
    Given the user successfully navigates to the Homepage.
  @CRMLYEUG-837
  Scenario: Multi choice
    When the user clicks Poll tab on the homepage
    And the user writes message title
    And the user clicks Add question button
    And the user adds questions
    And the user gives multiple answers
    And the user clicks Allow multiple choice button
    And the user clicks Send button
    Then the user sees blue thick on checkbox

