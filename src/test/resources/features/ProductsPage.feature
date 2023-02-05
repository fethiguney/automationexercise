
  Feature: Automation Exercise Products Page UI Test

    @productPagetestcase01
    Scenario:user should be able to add products to cart successfully
      Given user goes to automationexercise url
      When user clicks products page and is navigated all product page
      Then user hovers over first product and click add to cart button
      And user clicks continue shopping button
      Then user hovers over second product and click add to cart button
      And user clicks view cart button and verifies both product are added to cart
