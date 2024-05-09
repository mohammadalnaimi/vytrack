Feature: Select Vehicles

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"


    Scenario: Verify that once the users launch on the Vehicles page, the users can see all the checkboxes
    as unchecked.
      When user hover over  Fleet
      And user click on Vehicles
      Then Verify user see all the checkboxes as unchecked