Feature: Wishing to buy an expensive dress by adding it to the cart

Scenario: As a user of the website, I am wishing to buy an expensive dress by adding it to the cart
Given User enter the url in the browser
And user login to the website
When user selects the dresses tab
And clicks on evening dresses
And Add the expensive dress to the cart
Then user logout of the website
And user log back in the website
And the expensive dress should be in the cart


