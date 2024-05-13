@US009
Feature: Repeat Every input box range

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: : Verify that user sees error messages when they enter an invalid integer number into the calendar Repeat Every input box.
    Given the user logged in as "<userType>"
    When User is on Vytrack home page and hover over to activities
    And User clicks on calendar events
    And User clicks on create calendar event
    And User clicks on the Repeat check box
    And User enters "0" in Repeat Every input box
    Then User sees the error message


    Examples:
      | userType      |
      | Store manager |
      | Sales Manager |
      | Driver        |

  Scenario Outline: : Verify that user sees error messages when they enter an invalid integer number into the calendar Repeat Every input box.
    
    Given the user logged in as "<userType>"
    When User is on Vytrack home page and hover over to activities
    And User clicks on calendar events
    And User clicks on create calendar event
    And User clicks on the Repeat check box
    And User enters "100" in Repeat Every input box
    Then User sees the error message


    Examples:
      | userType      |
      | Store manager |
      | Sales Manager |
      | Driver        |