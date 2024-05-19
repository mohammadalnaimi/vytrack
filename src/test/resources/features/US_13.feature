Feature: Manage filters on the vehicles costs

  Background: User is already in the log in page
    Given the user is on the login page
    #Given the user logged in with username as "salesmanager101" and password as "UserUser123"


  Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page.
    Given the user logged in as "<userType>"
    When user should hover over  Fleet button
    And  user should move and click on Vehicle Costs
    Then user should see "TYPE" , "TOTAL PRICE ", "DATE" columns on the Vehicle

    Examples:
    | userType |
    | store manager |
    | sales manager |

  Scenario Outline: Verify that users can check the first check box to select all vehicle costs .
    Given the user logged in as "<userType>"
    When user should hover over  Fleet button
    And  user should move and click on Vehicle Costs
    Then user should see "TYPE" , "TOTAL PRICE ", "DATE" columns on the Vehicle
    Then user should click on first  checkbox button

    Examples:
      | userType |
      | store manager |
      | sales manager |
