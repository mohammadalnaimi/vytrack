@B33G4-70
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page

	@B33G4-68
	Scenario Outline:  Store manager and Sales manager can see 10 columns on the Vehicles Model page
		Given the user logged in as "<userType>"
		    When user hover over  Fleet
		    And user click on Vehicles Model
		    Then Verify user see below information in the columns
		      | MODEL NAME               |
		      | MAKE                     |
		      | CAN BE REQUESTED         |
		      | CVVI                     |
		      | CO2 FEE (/MONTH)         |
		      | COST (DEPRECIATED)       |
		      | TOTAL COST (DEPRECIATED) |
		      | CO2 EMISSIONS            |
		      | FUEL TYPE                |
		      | VENDORS                  |
		
		    Examples:
		      | userType      |
		      | Store Manager |
		      | Sales Manager |	

	
	@B33G4-69
	Scenario Outline:  Drivers cannot access the Vehicles Model page and see “You do not have permission to perform this action.” message on the screen.
		Given the user logged in as "<userType>"
		      When user hover over  Fleet
		      And user click on Vehicles Model
		      Then Verify user sees "You do not have permission to perform this action."
		
		      Examples:
		        | userType      |
		        | driver |