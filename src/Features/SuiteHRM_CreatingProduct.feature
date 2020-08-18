@SuiteCRM
Feature: Creating a Product

Scenario Outline: To use an external data to add products

	Given User is on SuiteCRMUrl Login Page
	And User enters SuiteCRM UserNames and Passwords
	And Navigate to All -> Products-> Create Product
	And Enter the productName "<ProductName>" and Price "<Price>"
	And Click Save To Create Product
	When Go to the View Products page to see product "<ProductName>" listed
	Then Close the CRMbrowser.

Examples:
|ProductName|Price|
|ProductTest|50|
|ProductTest2|70|