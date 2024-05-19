@B33G4-67
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page

	@B33G4-64
	Scenario Outline:  select any vehicle from the Vehicle page
		Given the user logged in as "<userType>"
		    When user hover over  Fleet
		    And user click on Vehicles
		    Then Verify user see all the checkboxes as unchecked
		
		    Examples:
		      | userType      |
		      | Store Manager |
		      | Sales Manager |	

	
	@B33G4-65
	Scenario Outline: users can check the first checkbox to select all the cars
		Given the user logged in as "<userType>"
		      When user hover over  Fleet
		      And user click on Vehicles
		      And user click on the first checkbox
		      Then verify all checkboxes are selected
		
		      Examples:
		        | userType      |
		        | Store Manager |
		        | Sales Manager |	

	
	@B33G4-66
	Scenario Outline: Verify that users can select any car
		Given the user logged in as "<userType>"
		        When user hover over  Fleet
		        And user click on Vehicles
		        And user select any car
		      
		
		        Examples:
		          | userType      |
		          | Store Manager |
		          | Sales Manager |