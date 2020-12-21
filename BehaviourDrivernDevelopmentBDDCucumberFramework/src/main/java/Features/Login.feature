Feature: Loginto to Guru99 school and Reset and Login Functionality

@SmokeTest
Scenario: Verify the login functionality of Guru99

Given user is on Guru99 home page
Then user enters username
Then user enters passowrd
Then user clicks on Reset button
Then close the browser

@RegressionSuite
Scenario: Verify the login functionality of Guru99

Given user is on Guru99 home page
Then user enters username
Then user enters passowrd
Then user clicks on login button
Then close the browser
