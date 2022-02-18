
  Feature: Attach a link by clicking on the link icon

    Background:
      Given the user successfully navigates to the Homepage

    @CRMLYEUG-820
    Scenario: The User attaches a link by clicking on the link icon
      When the user clicks Poll tab on the homepage
      And the user clicks on the post attach button
      And the user fills in the fields with link text and link url.
      And the user clicks Save button.
      Then verify the link text in the message header as written
