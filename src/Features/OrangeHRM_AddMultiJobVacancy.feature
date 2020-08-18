@OrangeHRM
Feature: Creating multiple vacancies

Scenario Outline: Creating multiple vacancies using data from an external excel spreadsheet

	Given User is on OrangeHRMUrl Login Page
	And User enters HRM UserNames and Passwords
	And Navigate to the Recruitment page and Click on the Vacancies
	And Click on the Add button to navigate to the Add Job Vacancy form
	And Fill out the following Details "<JobTitle>" "<VacanyName>" "<HiringManger>" "<NoOfPosition>" and "<Description>" details
	And Click the Save button to save the vacancy
	When Verify that the vacancy was created
	Then Close the HRMbrowser
	
Examples:
|JobTitle|VacanyName|HiringManger|NoOfPosition|Description|
|Android Developer|Developer vacancy4|Test Tester|10|Android description|
|Android Developer|Developer vacancy5|Test Tester|15|Android description|