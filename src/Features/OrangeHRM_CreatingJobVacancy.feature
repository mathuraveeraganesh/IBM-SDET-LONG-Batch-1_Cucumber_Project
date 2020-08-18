@OrangeHRM
Feature: Creating a job vacancy

Scenario: Adding a candidate for recruitment

	Given User is on OrangeHRMUrl Login Page
	And User enters HRM UserNames and Passwords
	And Navigate to the Recruitment page and Click on the Vacancies
	And Click on the Add button to navigate to the Add Job Vacancy form
	And Fill out the necessary details
	And Click the Save button to save the vacancy
	When Verify that the vacancy was created
	Then Close the HRMbrowser