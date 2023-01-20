
  Feature: Automation Exercise UI Test
   @testcase01
    Scenario: user should be login valid username and password
     Given user goes to automationexercise url
     When user verifies homepage is visible
     Then click on signup and login button
     And user verifies "Login to your account" is visible
     Then user enters valid username and password and click login button
     And user verifies that "Logged in as test" is visible

    @testcase02
    Scenario: user should not be login invalid username and password
     Given user goes to automationexercise url
     Then click on signup and login button
     And user verifies "Login to your account" is visible
     Then user enters invalid username and password and click login button
     And user sees "Your email or password is incorrect!" error message

   @testcase03
   Scenario: user should be logout after login invalid username and password
    Given user goes to automationexercise url
    Then click on signup and login button
    And user verifies "Login to your account" is visible
    Then user enters valid username and password and click login button
    And user verifies that "Logged in as test" is visible
    Then user click logout button and user navigated to login page

   @testcase04
   Scenario: user should not be register with existence email
    Given user goes to automationexercise url
    When user verifies homepage is visible
    Then click on signup and login button
    And user verifies that New User Signup! text is visible
    Then user enters existence email and click signup button
    And user sees Email Address already exist! error message

    @testcase05
    Scenario: user should be able to fill and submit the contact us form
     and than should go home page
     Given user goes to automationexercise url
     When user clicks contact us button and verifies GET IN TOUCH header is visible
     Then user fills name, email, subject and message bars and clicks submit button
     And user click ok button on js alert and sees Success! Your details have been submitted successfully message
     Then user click home link button and verifies that landes to home page successfully


