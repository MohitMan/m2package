Feature: This is a sample google coordinate BDD implementation 

@TEST
Scenario: Check google coordinate 
	Given URL details for google 
	When I search anything 
	Then I should see page coordinate
	
@DEV
Scenario: Check google coordinate MO
	Given URL details for google 
	When I search anything 
	Then I should see page coordinate