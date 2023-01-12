
  Feature: Automation Exercise UI Test
   @testcase02
    Scenario: Test Case 02 user should be login valid username and password
     Given user goes to automationexercise url
     When user verifies homepage is visible
     Then click on signup and login button
     And user verifies "Login to your account" is visible
     Then user enters valid username and password and click login button
     And user verifies that "Logged in as test" is visible


