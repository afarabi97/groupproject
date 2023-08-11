@regression @smoke @GA-01 @E2E
Feature: Amazon Shop By Department

Description: User should able to shop by Department
	
	Scenario: Open Shop by Department to view books		
	    Given Open Amazon Homepage 
		When click on All bars
		And click on books through shop by department
		And click on Audible books &originals
		And click on first book
		Then User should get an option to purchase