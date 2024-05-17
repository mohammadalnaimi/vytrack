Feature: Main modules features

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that store and sales managers sees 8 module names
    Given the user logged in as "<userType>"
    Then users sees 8 modules names in the home page


    Examples:
      | userType      |
      | Store manager |
      | Sales Manager |


    Scenario Outline: Verify that driver sees 4 module names
      Given the user logged in as "<userType>"
      Then driver users sees 4 modules in the home page

    Examples:
      | userType      |
      | Driver        |












