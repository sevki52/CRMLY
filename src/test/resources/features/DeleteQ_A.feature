Feature: Delete Questions and Answers

  Background:
    Given the user successfully navigates to the Homepage.

  @CRMLYEUG-836
  Scenario: Delete Questions and Answer
    Given the user clicks Poll tab on the homepage
    When the user clicks Add question button
    And the user adds questions
    And the user clicks X button
    Then verify to delete questions and answer