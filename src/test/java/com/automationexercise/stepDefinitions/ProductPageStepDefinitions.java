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
    @When("user clicks view product for the {int}. product on home page")
    public void user_clicks_view_product_for_the_product_on_home_page(Integer prdctOrder) {

    }
    @Then("user verifies product detail is opened and increase quantity to {int}")
    public void user_verifies_product_detail_is_opened_and_increase_quantity_to(Integer quantity) {

    }
    @Then("user clicks add to cart button and clicks view cart")
    public void user_clicks_add_to_cart_button_and_clicks_view_cart() {

    }
    @Then("user verifies that product is displayed in cart page with {int} quantity")
    public void user_verifies_that_product_is_displayed_in_cart_page_with_quantity(Integer quantity) {

    }


}
