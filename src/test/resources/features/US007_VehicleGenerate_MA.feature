@US007
Feature: Select Vehicles

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that once the users launch on the Vehicles page, the users can see all the checkboxes
  as unchecked.
    Given the user logged in as "<userType>"
    When user hover over  Fleet
    And user click on Vehicles
    Then Verify user see all the checkboxes as unchecked

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


    Scenario Outline: Verify that users can check the first checkbox to select all the cars
      Given the user logged in as "<userType>"
      When user hover over  Fleet
      And user click on Vehicles
      And user click on the first checkbox
      Then verify all checkboxes are selected

      Examples:
        | userType      |
        | Store Manager |
        | Sales Manager |

@wipMA
      Scenario Outline: Verify that users can select any car
        Given the user logged in as "<userType>"
        When user hover over  Fleet
        And user click on Vehicles
        And user select any car
       # Then verify the checkbox user clicked on is selected

        Examples:
          | userType      |
          | Store Manager |
          | Sales Manager |