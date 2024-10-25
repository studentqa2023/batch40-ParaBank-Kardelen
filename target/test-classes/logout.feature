@functional
Feature:Parabank logout testing
Description: User should have a login account
#Background: User should be logged in
@TC1 @smoke @regression
Scenario Outline: As a user when you logged in, I want to logout from the Parabank site with valid credantials, so that my account info is safe
Given Open the browser
And pass the Parabank URL "<URL>"
When Enter the username "<username>"
And Enter the password "<password>"
And click on login button
And Click on logout button
Then Validate logout is successful
Given Quit all browser

Examples:
|URL                                              |username |password |
|https://parabank.parasoft.com/parabank/index.htm |Kardelen1  |Martinez.1|