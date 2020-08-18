@SuiteCRM
Feature: Schedule a meeting and invite members

Scenario Outline: To schedule a meeting and include at least 3 invitees

	Given User is on SuiteCRMUrl Login Page
	And User enters SuiteCRM UserNames and Passwords
	And Navigate to Activities -> Meetings -> Schedule a Meeting
	And Enter the Subject "<Subject>" of the meeting.
	And Search for members "<Name>" and add them to the meeting
	And Click Save Meeting to finish
	When Navigate to View Meetings page and confirm creation of the meeting for "<Subject>"
	Then Close the CRMbrowser.
	
Examples:
|Subject||Name|
|TestMathura||admin|
|TestVeera||max|
|TestGanesh||chris|