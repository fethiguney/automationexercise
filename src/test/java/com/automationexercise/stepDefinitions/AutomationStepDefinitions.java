package com.automationexercise.stepDefinitions;

import com.automationexercise.pages.AutomationExercisePage;
import com.automationexercise.utilities.ConfigReader;
import com.automationexercise.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.ElementClickInterceptedException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class AutomationStepDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Given("user goes to automationexercise url")
    public void user_goes_to_automationexercise_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise"));
    }
    @When("user verifies homepage is visible")
    public void user_verifies_homepage_is_visible() {
        assertEquals(ConfigReader.getProperty("automationExercise"), Driver.getDriver().getCurrentUrl());
    }
    @Then("click on signup and login button")
    public void click_on_signup_and_login_button() {
        automationExercisePage.linkSignupLogin.click();
    }
    @Then("user verifies {string} is visible")
    public void user_verifies_is_visible(String loginText) {
        assertEquals(automationExercisePage.loginYourAccount.getText(), loginText);
    }
    @Then("user enters valid username and password and click login button")
    public void user_enters_valid_username_and_password_and_click_login_button() {
        automationExercisePage.inputLoginEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        automationExercisePage.inputLoginPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        automationExercisePage.buttonLogin.click();
    }
    @Then("user verifies that {string} is visible")
    public void user_verifies_that_is_visible(String loginText) {
       assertEquals( automationExercisePage.linkLoggedTest.getText(), loginText);
    }
    @Then("user enters invalid username and password and click login button")
    public void user_enters_invalid_username_and_password_and_click_login_button() {
      automationExercisePage.inputLoginEmail.sendKeys(ConfigReader.getProperty("invalidUserName"));
      automationExercisePage.inputLoginPassword.sendKeys(ConfigReader.getProperty("invalidPassword"));
      automationExercisePage.buttonLogin.click();
    }
    @Then("user sees {string} error message")
    public void user_sees_error_message(String errormessage) {
        assertEquals(automationExercisePage.yourEmailPasswordIncorrect.getText(), errormessage);
    }


    @Then("user click logout button and user navigated to login page")
    public void userClickLogoutButtonAndUserNavigatedToLoginPage() {
        automationExercisePage.linkLogout.click();
        assertEquals(ConfigReader.getProperty("automationExerciseLoginPage"), Driver.getDriver().getCurrentUrl());
    }
    @Then("user verifies that New User Signup! text is visible")
    public void user_verifies_that_new_user_signup_text_is_visible() {
        assertTrue(automationExercisePage.newUserSignup.isDisplayed());
    }
    @Then("user enters existence email and click signup button")
    public void user_enters_existence_email_and_click_signup_button() {
        automationExercisePage.inputSignupName.sendKeys(ConfigReader.getProperty("userName"));
        automationExercisePage.inputSignupEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        automationExercisePage.buttonSignup.click();
    }
    @Then("user sees Email Address already exist! error message")
    public void user_sees_email_address_already_exist_error_message() {
        assertTrue(automationExercisePage.emailAddressAlreadyExist.isDisplayed());
    }

    @When("user clicks contact us button and verifies GET IN TOUCH header is visible")
    public void user_clicks_contact_us_button_and_verifies_get_ın_touch_header_is_visible() {
        automationExercisePage.linkContact.click();
        assertTrue(automationExercisePage.h2GetTouch.isDisplayed());
    }
    @Then("user fills name, email, subject and message bars and clicks submit button")
    public void user_fills_name_email_subject_and_message_bars_and_clicks_submit_button() {
        automationExercisePage.inputName.sendKeys("test");
        automationExercisePage.inputEmail.sendKeys("test1234@gmail.com");
        automationExercisePage.inputSubject.sendKeys("subject");
        automationExercisePage.textareaMessage.sendKeys("message");
        automationExercisePage.inputSubmitButton.click();
    }
    @Then("user fills {string} {string} {string} and {string} bars and clicks submit button")
    public void user_fills_and_bars_and_clicks_submit_button(String name, String email, String subject, String message) {
        automationExercisePage.inputName.sendKeys(name);
        automationExercisePage.inputEmail.sendKeys(email);
        automationExercisePage.inputSubject.sendKeys(subject);
        automationExercisePage.textareaMessage.sendKeys(message);
        automationExercisePage.inputSubmitButton.click();
    }
    @Then("user click ok button on js alert and sees Success! Your details have been submitted successfully message")
    public void user_click_ok_button_on_js_alert_and_sees_success_your_details_have_been_submitted_successfully_message() {
        Driver.getDriver().switchTo().alert().accept();
        assertTrue(automationExercisePage.divSuccessYourDetailsHave.isDisplayed());
    }
    @Then("user click home link button and verifies that landes to home page successfully")
    public void user_click_home_link_button_and_verifies_that_landes_to_home_page_successfully() {
        automationExercisePage.linkHome.click();
    }
    @When("user clicks test cases button")
    public void user_clicks_test_cases_button() {
        automationExercisePage.linkTestCases.click();
    }
    @Then("user is navigated test cases page successfully")
    public void user_is_navigated_test_cases_page_successfully() {
     assertEquals(ConfigReader.getProperty("automationExerciseTestCasePage"), Driver.getDriver().getCurrentUrl());
    }
    @When("user clicks products page and is navigated all product page")
    public void user_clicks_products_page_and_is_navigated_all_product_page() {
        automationExercisePage.linkProducts.click();
        Driver.getDriver().navigate().refresh();
        automationExercisePage.linkProducts.click();
        assertEquals(ConfigReader.getProperty("automationExerciseProductsPage"), Driver.getDriver().getCurrentUrl());
    }
    @Then("user clicks on view product of first product and is landed to product detail page")
    public void user_clicks_on_view_product_of_first_product_and_is_landed_to_product_detail_page() {
        automationExercisePage.linkViewProduct.click();
    }
    @Then("use verifies product name, category, price, availability, condition and brand details are visible")
    public void use_verifies_product_name_category_price_availability_condition_and_brand_details_are_visible() {
        assertTrue(automationExercisePage.productName.isDisplayed());
        assertTrue(automationExercisePage.category.isDisplayed());
        assertTrue(automationExercisePage.availabilityStock.isDisplayed());
        assertTrue(automationExercisePage.condition.isDisplayed());
    }
    @Then("user enters {string} product name in search bar and clicks search button")
    public void user_enters_product_name_in_search_bar_and_clicks_search_button(String product) {
        automationExercisePage.inputSearchProduct.sendKeys(product);
        automationExercisePage.buttonSubmitSearch.click();
    }

    @Then("user sees SEARCHED PRODUCTS text is visible and verifies all the products related to {string} search")
    public void user_sees_searched_products_text_is_visible_and_verifies_all_the_products_related_to_search(String searchProduct) {
        assertTrue(automationExercisePage.h2SearchedProducts.isDisplayed());
        ;
    }
}
