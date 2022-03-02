Feature: Delete Questions and Answers

  Background:
    Given the user successfully navigates to the Homepage.

  @CRMLYEUG-837
  Scenario: Multi choice
    Given the user clicks Poll tab on the homepage
    When the user writes message title
    And the user clicks Add question button
    And the user adds questions
    And the user gives multiple answers
    And the user clicks Allow multiple choice button
    Then the user clicks Send button


