@AlchemyJobs
Feature: Searching for jobs using XPath

Scenario: Searching for jobs and applying to them using XPath

	Given User is on AlchemyJobUrl Login Page
	And navigate to Jobs page
	And Find the Keywords search input field and Type in keywords to search for jobs
	And Find the filter using XPath and filter job type to show only Full Time jobs
	When Find the title of the job listing and print and Click on the Apply
	Then Close the AlchemyBrowser