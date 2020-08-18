@AlchemyJobs
Feature: Using Examples table to post a job

Scenario Outline:Multiple Job Post

	Given User is on AlchemyJobUrl Login Page
	And Go to Post a Job page
	And Enter the Email "<Email>"
	And Enter the JobTitle "<JobTitle>"
	And Enter the JobDescription "<JobDescription>"
	And Enter the ApplicationUrl "<ApplicationUrl>"
	And Enter the CompanyName "<CompanyName>"
	And Click submit
	And Go to the Jobs page
	When Confirm job listing is shown on page.
	Then Close the AlchemyBrowser
	
Examples:
|Email|JobTitle|JobDescription|ApplicationUrl|CompanyName|
|mathura7@gmail.com|Test Title|Test Description|https://alchemy.hguy.co/jobs/post-a-job/|IBM|
|mathura8@gmail.com|Test Title1|Test Description1|https://alchemy.hguy.co/jobs/post-a-job/|HCL|