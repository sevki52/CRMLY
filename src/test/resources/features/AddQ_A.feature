Feature: Add Questions and Answers

  Background:
    Given the user successfully navigates to the Homepage.
    @CRMLYEUG-835
    Scenario: Add Questions and Answers
      When the user clicks Poll tab on the homepage
      And the user writes message title
      And the user clicks Add question button
      And the user adds questions
      And the user gives multiple answers
#      And the user clicks Send button
      Then verify the message box

