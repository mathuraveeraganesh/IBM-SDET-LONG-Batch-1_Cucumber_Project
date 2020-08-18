@OrangeHRM
Feature: Adding a candidate for recruitment

Scenario: Add information about a candidate for recruitment
	
	Given User is on OrangeHRMUrl Login Page
	And User enters HRM UserNames and Passwords
	And Navigate to the Recruitment page and click on the Add button
	And Fill in the details of the candidate
	And Upload a resume to the form
	And Click Save
	When Navigate back to the Recruitments page to confirm candidate entry
	Then Close the HRMbrowser