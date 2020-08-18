@SuiteCRM
Feature: Create leads using parameterization

Scenario Outline: Add information about a candidate for recruitment

	Given User is on SuiteCRMUrl Login Page
	And User enters SuiteCRM UserNames and Passwords
	And Navigate to Sales -> Leads -> Create Lead
	And And Fill in the required Create Lead fields using the "<salutation>" "<FirstName>" "<LastName>" "<Phone_work>" and "<Phone_mobile>" data from the Examples table
	And Click Save to finish
	When Navigate to the View Leads page to see results "<FirstName>"
	Then Close the CRMbrowser.

Examples:
|salutation|FirstName|LastName|Phone_work|Phone_mobile|
|Mr.|Veera3|Ganesh|9987654398|8976543797|
|Mr.|Mathura3|Ganesh|9987654399|8976543798|