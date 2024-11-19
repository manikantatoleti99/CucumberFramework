@Google @Smoke
Feature: Test google Search Functionality
Scenario: Validate google search is working or not
#Given Open Browser
And User is on Google Search page
When User enters a text 
And Clicks search
Then Validate user is search result page
