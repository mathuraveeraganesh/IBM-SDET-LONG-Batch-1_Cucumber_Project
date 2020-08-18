@SuiteCRM
Feature: Counting Dashlets

Scenario: Open the homepage and count the number of the dashlets on the page.

	Given User is on SuiteCRMUrl Login Page
	And User enters SuiteCRM UserNames and Passwords
	When Count the number of Dashlets and Print the No and title of each Dashlet
	Then Close the CRMbrowser.