Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: As a user, I want to create a recurring (repetitive) calendar event
    Given the user logged in as "<userType>"
    When User is on Vytrack home page and hoverover  to activities
    And User click on  calendar events
    And User click on  create calendar event
    And user click on the Repeat check box
    Then User sees number "1" in repeat check box


    Examples:
      | userType      |
      | Store manager |
      | Sales Manager |
      | Driver        |


  @AC2
   Scenario Outline: Verify that users see the error message “This value should not be blank.”
      Given the user logged in as "<userType>"
      When User is on Vytrack home page and hoverover  to activities
      And User click on  calendar events
      And User click on  create calendar event
      And user click on the Repeat check box
      And user click inside repeat every and delete number 1
      Then user sees the error message This value should not be blank


      Examples:
        | userType      |
        | Store manager |
        | Sales Manager |
        | Driver        |