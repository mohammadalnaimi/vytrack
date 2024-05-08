Feature: Recurring Calendar Event Verification

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "storemanager51" and password as "UserUser123"

    Scenario: As a user, I want to create a recurring (repetitive) calendar event.
      Given the user is logged in on homepage
      Then the user hovers over "Activities"
      Then the user clicks "Calendar Events"
      Then the user click "Create Calendar Event"
      Then the user clicks "Repeat" checkbox
      And the user clicks "Repeat Every" radio button
      Then the user sees the number 1 by default in "Repeat Every" input option
      Then the user deletes 1
      Then user sees error message "This value should not be blank."