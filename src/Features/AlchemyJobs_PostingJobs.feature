@AlchemyJobs
Feature: Posting a job using parameterization

Scenario: Post a job using details passed from the Feature file

	Given User is on AlchemyJobUrl Login Page
	And Go to Post a Job page
	And Enter the Email "mathura6@gmail.com"
	And Enter the JobTitle "Test Title"
	And Enter the JobDescription "Test Description"
	And Enter the ApplicationUrl "https://alchemy.hguy.co/jobs/post-a-job/"
	And Enter the CompanyName "IBM"
	And Click submit
	And Go to the Jobs page
	When Confirm job listing is shown on page.
	Then Close the AlchemyBrowser