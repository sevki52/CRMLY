Feature: Add Questions and Answers

  Background:
    Given the user successfully navigates to the Homepage.
    @CRMLYEUG-835
    Scenario: Add Questions and Answers
      Given the user clicks Poll tab on the homepage
      When the user writes message title
      And the user clicks Add question button
      And the user adds questions
      And the user gives multiple answers
      Then the user clicks Send button


