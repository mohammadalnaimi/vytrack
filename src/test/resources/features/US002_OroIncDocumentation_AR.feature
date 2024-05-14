Feature: Repeat Every input box range

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that user sees error messages when they enter an invalid integer number into the calendar Repeat Every input box.
    Given the user logged in as "<userType>"
    When User is on Vytrack home page and clicks on question mark
    Then User sees the new tab opens with OroInc Documentation website

    Examples:
      | userType      |
      | Store manager |
      | Sales Manager |
      | Driver        |