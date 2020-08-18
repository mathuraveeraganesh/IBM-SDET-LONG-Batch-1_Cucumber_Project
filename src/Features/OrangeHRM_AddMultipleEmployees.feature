@OrangeHRM
Feature: Add multiple employees

Scenario Outline: Add multiple employees using an the examples table

	Given User is on OrangeHRMUrl Login Page
	And User enters HRM UserNames and Passwords
	And Find the PIM option in the menu and click it
	And Click the Add button to add a new Employee
	And Make sure the Create Login Details checkbox is checked
	And Fill in the required fields using the "<Firstname>" "<LastName>" and "<EmployeeID>" data from the Examples table
	And Enter "<UserName>" and "<Password>" to create the login 
	And Click Save
	When Verify that the employees have been created.
	Then Close the HRMbrowser

Examples:
|Firstname|LastName|EmployeeID|UserName|Password|
|mathura6|ganesh2|09880|mathura6ganesh|Mathura1@123|
|veera2|ganesh2|09861|veera2ganesh|Mathura1@123|