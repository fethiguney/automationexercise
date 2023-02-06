package com.automationexercise.stepDefinitions;


import com.automationexercise.pages.AutomationExercisePage;
import io.cucumber.java.en.*;

import static com.automationexercise.utilities.ReusableMethods.*;
import static org.junit.Assert.*;

public class ProductPageStepDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Then("user hovers over first product and click add to cart button")
    public void user_hovers_over_first_product_and_click_add_to_cart_button() {
       hover(automationExercisePage.productOverLaysList.get(0));
       actionsClick(automationExercisePage.addToCartButtonList.get(0));
    }
    @Then("user clicks continue shopping button")
    public void user_clicks_continue_shopping_button() {
        automationExercisePage.continueShoppingButton.click();
    }
    @Then("user hovers over second product and click add to cart button")
    public void user_hovers_over_second_product_and_click_add_to_cart_button() {

        hover(automationExercisePage.productOverLaysList.get(1));
        actionsClick(automationExercisePage.addToCartButtonList.get(1));
    }
    @Then("user clicks view cart button and verifies both product are added to cart")
    public void user_clicks_view_cart_button_and_verifies_both_product_are_added_to_cart() {
        automationExercisePage.viewCartButton.click();
        assertEquals(2, automationExercisePage.productNamesAddedCart.size());
    }
}
