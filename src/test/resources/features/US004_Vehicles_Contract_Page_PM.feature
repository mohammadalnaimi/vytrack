Feature: As a user, I want to access to Vehicle Contracts page



@US004
Scenario Outline: As a user, I want to access to Vehicle Contracts page
  Given the user logged in as "<userType>"
  When user is on the Vehicle_Contracts_Page and hoverover to Fleet
  And user click on Vehicles Contracts
  And user verify URl
  Then user verify the title

  Examples:
    | userType      |
    | Store manager |
    | Sales Manager |


  @US004_DriverScenario
  Scenario: Driver sees You do not have permission to perform this action.
    Given the user logged in as "driver"
    When When user is on the Vehicle_Contracts_Page and hoverover to Fleet
    And user click on Vehicles Contracts
    Then user sees a massage You do not have permission to perform this action
