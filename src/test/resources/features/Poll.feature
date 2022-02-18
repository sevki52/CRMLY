Feature: Delete Questions and Answers

  Background:
    Given the user successfully navigates to the Homepage.
    @CRMLYEUG-850
    Scenario: Send a Poll
      Given the user clicks Poll tab on the home page
      When the user writes message title.
      And the user  clicks All employees under the pool tab.
      And the user clicks on employees and departments on the right side.
      And the user selects multiple contacts from Employees and Departments contact lists.
      And the user adds questions.
      And the user gives multiple answers.
      Then the user clicks Send button.
