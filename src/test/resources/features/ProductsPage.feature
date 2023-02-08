
  Feature: Automation Exercise Products Page UI Test

    @productPagetestcase01
    Scenario:user should be able to add products to cart successfully
      Given user goes to automationexercise url
      When user clicks products page and is navigated all product page
      Then user hovers over product 1 and click add to cart button
      And user clicks continue shopping button
      Then user hovers over product 2 and click add to cart button
      And user clicks view cart button and verifies both two product are added to cart

    @productPagetestcase02
    Scenario:user should be able to select product from home page and then add to cart
      Given user goes to automationexercise url
      When user clicks view product for the 1. product on home page
      Then user verifies product detail is opened and increase quantity to 4
      And user clicks add to cart button and clicks view cart
      Then user verifies that product is displayed in cart page with 4 quantity