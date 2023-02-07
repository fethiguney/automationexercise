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

    @Then("user hovers over product {int} and click add to cart button")
    public void user_hovers_over_product_and_click_add_to_cart_button(Integer prdctOrder) {
        int num=prdctOrder-1;
        hover(automationExercisePage.productOverLaysList.get(num));
        clickedProductNames.add(automationExercisePage.productsNameList.get(num).getText());
        waitFor(1);
        jsClick(automationExercisePage.addToCartButtonList.get(num));

    }
    @Then("user clicks continue shopping button")
    public void user_clicks_continue_shopping_button() {
        automationExercisePage.continueShoppingButton.click();
    }

    @Then("user clicks view cart button and verifies both two product are added to cart")
    public void user_clicks_view_cart_button_and_verifies_both_two_product_are_added_to_cart() {
        automationExercisePage.viewCartButton.click();
        addedCartProductNames.add(automationExercisePage.productNamesAddedCart.get(0).getText());
        addedCartProductNames.add(automationExercisePage.productNamesAddedCart.get(1).getText());
        assertTrue(addedCartProductNames.containsAll(clickedProductNames));

    }


}
