@B33G4-77
Feature: Default

	
	@B33G4-75
	Scenario Outline: Verify that Store and Sales managers see 8 module names
		Given the user logged in as "<userType>"
		    Then users sees 8 modules names in the home page
		
		
		    Examples:
		      | userType      |
		      | Store manager |
		      | Sales Manager |	

	
	@B33G4-76
	Scenario Outline: Verify that Drivers see 4 module names.
		Given the user logged in as "<userType>"
		      Then driver users sees 4 modules in the home page
		
		    Examples:
		      | userType      |
		      | Driver        |