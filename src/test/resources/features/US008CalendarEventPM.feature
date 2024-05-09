Feature: Recurring Calendar Event Verification

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: As a user, I want to create a recurring (repetitive) calendar event.
    Given the user logged in as "<userType>"
    Then the user hovers over "Activities"
    And the user clicks "Calendar Events"
    And the user click "Create Calendar Event"
    And the user clicks "Repeat" checkbox
    And the user clicks "Repeat Every" radio button
      Then the user sees the number 1 by default in "Repeat Every" input option
    Examples:
      | userType|
      | store manager|
      | sales manager|
      |     driver   |


  Scenario Outline: As a user, I want to create a recurring (repetitive) calendar event.
    Given the user logged in as "<userType>"
    Then the user hovers over "Activities"
    And the user clicks "Calendar Events"
    And the user click "Create Calendar Event"
    And the user clicks "Repeat" checkbox
    And the user clicks "Repeat Every" radio button
    And the user deletes 1
    Then user sees error message "This value should not be blank."
    Examples:
      | userType|
      | store manager|
      | sales manager|
      |     driver   |
