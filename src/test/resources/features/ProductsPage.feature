
  Feature: Automation Exercise Products Page UI Test

    @productPagetestcase01 @regression @smoke
    Scenario:user should be able to add products to cart successfully
      Given user goes to automationexercise url
      When user clicks products page and is navigated all product page
      Then user hovers over product 1 and click add to cart button
      And user clicks continue shopping button
      Then user hovers over product 2 and click add to cart button
      And user clicks view cart button
      Then user verifies both two product are added to cart

    @productPagetestcase02 @regression @smoke
    Scenario:user should be able to select product from home page and then add to cart
      Given user goes to automationexercise url
      When user clicks view product for the 3. product on home page
      Then user verifies product detail is opened and increase quantity to 2
      And user clicks add to cart button and clicks view cart
      Then user verifies that product is displayed in cart page with 2 quantity

    @productPagetestcase03 @regression @E2E @smoke
    Scenario:user should be place order a product while register to the platform
      Given user goes to automationexercise url
      Then user hovers over product 1 and click add to cart button
      And user clicks view cart button
      Then user clicks proceed to checkout button
      And user clicks RegisterLogin button and fills details in signup and create account
      Then user verifies account created and log in as text are visible
      And user clicks cart button
      Then user clicks proceed to checkout button
      And user enters description in comment text area and click place order button
      Then user enters payment details and clicks pay and confirm order button
      And user clicks delete account button then click continue button

    @productPagetestcase04 @regression @E2E @smoke
    Scenario:user should be place order a product after register to the platform
      Given user goes to automationexercise url
      When click on signup and login button
      Then user fills name and email address and click signup button
      And user fills new user informations and click create account button
      Then user verifies account created and log in as text are visible
      And user hovers over product 3 and click add to cart button
      When user clicks view cart button
      Then user clicks proceed to checkout button
      And user enters description in comment text area and click place order button
      Then user enters payment details and clicks pay and confirm order button
      And user clicks delete account button then click continue button

    @productPagetestcase05 @regression @E2E @smoke
    Scenario:user should be able to place order after successfully login to the platform
      Given user goes to automationexercise url
      When click on signup and login button
      Then user enters valid username and password and click login button
      And user verifies that "Logged in as test" is visible
      Then user hovers over product 2 and click add to cart button
      When user clicks view cart button
      Then user clicks proceed to checkout button
      And user enters description in comment text area and click place order button
      Then user enters payment details and clicks pay and confirm order button
      And user clicks delete account button then click continue button

    @productPagetestcase06 @regression
    Scenario:user should be able to remove products from cart
      Given user goes to automationexercise url
      Then user hovers over product 1 and click add to cart button
      And user clicks view cart button
      Then user clicks x button to remove product from the cart
      And user verifies cart page is empty

    @productPagetestcase07 @regression
    Scenario:user should be able to select a category and view products
    that are related to the category
      Given user goes to automationexercise url
      Then user clicks women category
      And user clicks first category link under women category
      Then user verifies category page is displayed and confirm text "WOMEN - DRESS PRODUCTS"
      And user clicks on first sub-category link of man category on the left side bar
      Then user verifies category page is displayed and confirm text "MEN - TSHIRTS PRODUCTS"

    @productPagetestcase08 @regression
    Scenario:user should be able to see brands on the left side bar in the product page
    and can navigate brand page
      Given user goes to automationexercise url
      When user clicks on products button
      Then user clicks on 1. brand name on left side bar
      And user verifies that is navigated to brand page
      Then user clicks on 2. brand name on left side bar
      And user verifies that is navigated to brand page

