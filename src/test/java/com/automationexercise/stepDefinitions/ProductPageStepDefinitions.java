package com.automationexercise.stepDefinitions;


import com.automationexercise.pages.AutomationExercisePage;
import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.List;

import static com.automationexercise.utilities.ReusableMethods.*;
import static org.junit.Assert.*;

public class ProductPageStepDefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    List<String> clickedProductNames=new ArrayList<>();
    List<String> addedCartProductNames=new ArrayList<>();

    @Then("user hovers over first product and click add to cart button")
    public void user_hovers_over_first_product_and_click_add_to_cart_button() {
        hover(automationExercisePage.productOverLaysList.get(0));
        clickedProductNames.add(automationExercisePage.productsNameList.get(0).getText());
        waitFor(1);
        jsClick(automationExercisePage.addToCartButtonList.get(0));
    }

    @Then("user clicks continue shopping button")
    public void user_clicks_continue_shopping_button() {
        automationExercisePage.continueShoppingButton.click();

    }

    @Then("user hovers over second product and click add to cart button")
    public void user_hovers_over_second_product_and_click_add_to_cart_button() {
        hover(automationExercisePage.productOverLaysList.get(1));
        clickedProductNames.add(automationExercisePage.productsNameList.get(1).getText());
        waitFor(1);
        jsClick(automationExercisePage.addToCartButtonList.get(1));
    }

    @Then("user clicks view cart button and verifies both product are added to cart")
    public void user_clicks_view_cart_button_and_verifies_both_product_are_added_to_cart() {
        automationExercisePage.viewCartButton.click();
        addedCartProductNames.add(automationExercisePage.productNamesAddedCart.get(0).getText());
        addedCartProductNames.add(automationExercisePage.productNamesAddedCart.get(1).getText());
        assertTrue(addedCartProductNames.containsAll(clickedProductNames));
    }
}
