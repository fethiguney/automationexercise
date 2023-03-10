
Feature: Automation Exercise Home Page UI Test

  @homepagetestcase01 @regression
  Scenario: user should be sign up successfully
    Given user goes to automationexercise url
    When user verifies homepage is visible
    Then user click signupLogin button
    And user fills name and email address and click signup button
    Then user fills new user informations and click create account button
    And user verifies account created and log in as text are visible
    Then user clicks delete account button then click continue button

  @homepagetestcase02 @regression
  Scenario: user should be login valid username and password
    Given user goes to automationexercise url
    When user verifies homepage is visible
    Then click on signup and login button
    And user verifies "Login to your account" is visible
    Then user enters valid username and password and click login button
    And user verifies that "Logged in as test" is visible

  @homepagetestcase03 @regression
  Scenario: user should not be login invalid username and password
    Given user goes to automationexercise url
    Then click on signup and login button
    And user verifies "Login to your account" is visible
    Then user enters invalid username and password and click login button
    And user sees "Your email or password is incorrect!" error message

  @homepagetestcase04 @regression
  Scenario: user should be logout after login invalid username and password
    Given user goes to automationexercise url
    Then click on signup and login button
    And user verifies "Login to your account" is visible
    Then user enters valid username and password and click login button
    And user verifies that "Logged in as test" is visible
    Then user click logout button and user navigated to login page

  @homepagetestcase05 @regression
  Scenario: user should not be register with existence email
    Given user goes to automationexercise url
    When user verifies homepage is visible
    Then click on signup and login button
    And user verifies that New User Signup! text is visible
    Then user enters existence email and click signup button
    And user sees Email Address already exist! error message

  @homepagetestcase06 @regression
  Scenario Outline: user should be able to fill and submit the contact us form
  and than should go home page
    Given user goes to automationexercise url
    When user clicks contact us button and verifies GET IN TOUCH header is visible
    Then user fills "<name>" "<email>" "<subject>" and "<message>" bars and clicks submit button
    And user click ok button on js alert and sees Success! Your details have been submitted successfully message
    Then user click home link button and verifies that landes to home page successfully
    Examples:
      | name | email             | subject   | message              |
      | test | test123@gmail.com | test data | contact form testing |


  @homepagetestcase07 @regression
  Scenario: user should be able to reach test cases page successfully
    Given user goes to automationexercise url
    When user clicks test cases button
    Then user is navigated test cases page successfully

  @homepagetestcase08 @regression
  Scenario: user should be able to select a product and see the details
     Given user goes to automationexercise url
     When user clicks products page and is navigated all product page
     Then user clicks on view product of first product and is landed to product detail page
     And use verifies product name, category, price, availability, condition and brand details are visible

  @homepagetestcase09 @regression
  Scenario: user should be able to search product and see the results which related to search
    Given user goes to automationexercise url
    When user clicks products page and is navigated all product page
    Then user enters "T-Shirt" product name in search bar and clicks search button
    And user sees SEARCHED PRODUCTS text is visible and verifies all the products related to "T-Shirt" search

  @homepagetestcase10 @regression
  Scenario: user should be able to find subscription box in the home page
    Given user goes to automationexercise url
    When user verifies subscription box in the footer
    Then user enters a subscribed email address and click button
    And user sees "You have been successfully subscribed!" message

  @homepagetestcase11 @regression
  Scenario: user should be able to find subscription box in the cart page
    Given user goes to automationexercise url
    And user clicks cart button
    When user verifies subscription box in the footer
    Then user enters a subscribed email address and click button
    And user sees "You have been successfully subscribed!" message