Feature: Automation Exercise Home Page UI Test

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


  @testcase06
  Scenario: user should be able to reach test cases page successfully
    Given user goes to automationexercise url
    When user clicks test cases button
    Then user is navigated test cases page successfully

  @testcase07
  Scenario: user should be able to select a product and see the details
     Given user goes to automationexercise url
     When user clicks products page and is navigated all product page
     Then user clicks on view product of first product and is landed to product detail page
     And use verifies product name, category, price, availability, condition and brand details are visible

  @testcase08
  Scenario: user should be able to search product and see the results which related to search
    Given user goes to automationexercise url
    When user clicks products page and is navigated all product page
    Then user enters "T-Shirt" product name in search bar and clicks search button
    And user sees SEARCHED PRODUCTS text is visible and verifies all the products related to "T-Shirt" search

  @testcase09
  Scenario: user should be able to find subscription box in the home page
    Given user goes to automationexercise url
    When user verifies subscription box in the footer
    Then user enters a subscribed email address and click button
    And user sees "You have been successfully subscribed!" message

  @testcase10
  Scenario: user should be able to find subscription box in the cart page
    Given user goes to automationexercise url
    And user clicks cart button
    When user verifies subscription box in the footer
    Then user enters a subscribed email address and click button
    And user sees "You have been successfully subscribed!" message