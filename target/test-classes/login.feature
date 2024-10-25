@functional
Feature:Parabank login testing
Description: User should already have an account in Parabank
#Background:
@TC1 @smoke @regression
Scenario Outline: As a user, I want to login to the Parabank site with valid credantials, so that I can use the bank website
Given Open the browser
And pass the Parabank URL "<URL>"
When Enter the username "<username>"
And Enter the password "<password>"
And click on login button
Then Validate login is successful

Examples:
|URL                                              |username |password |
|https://parabank.parasoft.com/parabank/index.htm |Kardelen1  |Martinez.1|

@regression
Scenario Outline: As a user,I want to login with only email but no password so that an error message is displayed
Given Open the browser
And pass the Parabank URL "<URL>"
When Enter the username "<username>"
And click on login button
Then Validate error message is displayed
Given Quit all browser

Examples:
|URL                                              |username |
|https://parabank.parasoft.com/parabank/index.htm |Kardelen1  |
