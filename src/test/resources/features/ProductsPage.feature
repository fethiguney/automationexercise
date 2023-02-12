
  Feature: Automation Exercise Products Page UI Test

    @productPagetestcase01
    Scenario:user should be able to add products to cart successfully
      Given user goes to automationexercise url
      When user clicks products page and is navigated all product page
      Then user hovers over product 1 and click add to cart button
      And user clicks continue shopping button
      Then user hovers over product 2 and click add to cart button
      And user clicks view cart button
      Then user verifies both two product are added to cart

    @productPagetestcase02
    Scenario:user should be able to select product from home page and then add to cart
      Given user goes to automationexercise url
      When user clicks view product for the 3. product on home page
      Then user verifies product detail is opened and increase quantity to 2
      And user clicks add to cart button and clicks view cart
      Then user verifies that product is displayed in cart page with 2 quantity

    @productPagetestcase03
    Scenario:user should be able to place order a product register while checkout
      Given user goes to automationexercise url
      Then user hovers over product 1 and click add to cart button
      And user clicks view cart button
      Then user clicks proceed to checkout button
      And user clicks Register/Login button and fills details in signup and create account