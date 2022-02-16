@wip
Feature: User should be able to login

  Background:
    Given the user navigates to the login page

  Scenario: the user should be able to login with valid credentials
    Given the user enters username as a "username" and "password"
    When the user clicks log in button
    Then the user should have logged in Portal
