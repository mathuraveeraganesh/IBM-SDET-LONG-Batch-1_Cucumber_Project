@AlchemyJobs
Feature: Create a new user

Scenario: Visit the site’s backend and create a new user

	Given User is on AlchemyUrl Login Page
	And User enters UserNames and Passwords
	And Locate the left hand menu and click the menu item that says Users
	And Locate the Add New button and click it
	And Fill in the necessary details
	And Click the Add New User button
	When Verify that the user was created
	Then Close the AlchemyBrowser