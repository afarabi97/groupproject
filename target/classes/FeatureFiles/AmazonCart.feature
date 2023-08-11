@regression @smoke @us-248
Feature: Amazon Cart Functionality

Description: User should able to add items in cart

	Background: 
		Given Open Amazon Homepage
	
	Scenario: Amazon cart functionality
		When Search for phonecase iphone 11
		And Select the first phone case from the item list
		And Select Quantity
		Then Add to cart