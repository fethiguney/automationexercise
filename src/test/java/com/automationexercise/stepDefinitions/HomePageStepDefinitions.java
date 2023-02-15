package com.automationexercise.stepDefinitions;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.utilities.ConfigReader;
import com.automationexercise.utilities.Driver;
import com.automationexercise.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

import static com.automationexercise.utilities.ReusableMethods.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomePageStepDefinitions {

    HomePage homePage =new HomePage();
    LoginPage loginPage=new LoginPage();

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
        homePage.linkSignupLogin.click();
    }
    @Then("user verifies {string} is visible")
    public void user_verifies_is_visible(String loginText) {
        assertEquals(homePage.loginYourAccount.getText(), loginText);
    }
    @Then("user click signupLogin button")
    public void user_click_signup_login_button() {
        homePage.linkSignupLogin.click();
    }
    @Then("user fills name and email address and click signup button")
    public void user_fills_name_and_email_address_and_click_signup_button() {
        loginPage.signupName.sendKeys(Faker.instance().name().fullName());
        loginPage.singupEmail.sendKeys(Faker.instance().internet().emailAddress());
        loginPage.signupButton.click();
    }
    @Then("user fills new user informations and click create account button")
    public void user_fills_new_user_informations_and_click_create_account_button() {
        ReusableMethods.signUp();
    }
    @Then("user verifies account created and log in as text are visible")
    public void user_verifies_account_created_and_log_in_as_text_are_visible() {
        assertTrue(loginPage.accountCreatedText.isDisplayed());
        for (int i = 0; i <2 ; i++) {
            homePage.linkHome.click();
            Driver.getDriver().navigate().refresh();}
        assertTrue(loginPage.loggedInAsText.isDisplayed());
    }
    @Then("user enters valid username and password and click login button")
    public void user_enters_valid_username_and_password_and_click_login_button() {
        homePage.inputLoginEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        homePage.inputLoginPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        homePage.buttonLogin.click();
    }
    @Then("user verifies that {string} is visible")
    public void user_verifies_that_is_visible(String loginText) {
       assertEquals( homePage.linkLoggedTest.getText(), loginText);
    }
    @Then("user enters invalid username and password and click login button")
    public void user_enters_invalid_username_and_password_and_click_login_button() {
      homePage.inputLoginEmail.sendKeys(ConfigReader.getProperty("invalidUserName"));
      homePage.inputLoginPassword.sendKeys(ConfigReader.getProperty("invalidPassword"));
      homePage.buttonLogin.click();
    }
    @Then("user sees {string} error message")
    public void user_sees_error_message(String errormessage) {
        assertEquals(homePage.yourEmailPasswordIncorrect.getText(), errormessage);
    }


    @Then("user click logout button and user navigated to login page")
    public void userClickLogoutButtonAndUserNavigatedToLoginPage() {
        homePage.linkLogout.click();
        assertEquals(ConfigReader.getProperty("automationExerciseLoginPage"), Driver.getDriver().getCurrentUrl());
    }
    @Then("user verifies that New User Signup! text is visible")
    public void user_verifies_that_new_user_signup_text_is_visible() {
        assertTrue(homePage.newUserSignup.isDisplayed());
    }
    @Then("user enters existence email and click signup button")
    public void user_enters_existence_email_and_click_signup_button() {
        homePage.inputSignupName.sendKeys(ConfigReader.getProperty("userName"));
        homePage.inputSignupEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        homePage.buttonSignup.click();
    }
    @Then("user sees Email Address already exist! error message")
    public void user_sees_email_address_already_exist_error_message() {
        assertTrue(homePage.emailAddressAlreadyExist.isDisplayed());
    }

    @When("user clicks contact us button and verifies GET IN TOUCH header is visible")
    public void user_clicks_contact_us_button_and_verifies_get_ın_touch_header_is_visible() {
        homePage.linkContact.click();
        assertTrue(homePage.h2GetTouch.isDisplayed());
    }
    @Then("user fills name, email, subject and message bars and clicks submit button")
    public void user_fills_name_email_subject_and_message_bars_and_clicks_submit_button() {
        homePage.inputName.sendKeys("test");
        homePage.inputEmail.sendKeys("test1234@gmail.com");
        homePage.inputSubject.sendKeys("subject");
        homePage.textareaMessage.sendKeys("message");
        homePage.inputSubmitButton.click();
    }
    @Then("user fills {string} {string} {string} and {string} bars and clicks submit button")
    public void user_fills_and_bars_and_clicks_submit_button(String name, String email, String subject, String message) {
        homePage.inputName.sendKeys(name);
        homePage.inputEmail.sendKeys(email);
        homePage.inputSubject.sendKeys(subject);
        homePage.textareaMessage.sendKeys(message);
        homePage.inputSubmitButton.click();
    }
    @Then("user click ok button on js alert and sees Success! Your details have been submitted successfully message")
    public void user_click_ok_button_on_js_alert_and_sees_success_your_details_have_been_submitted_successfully_message() {
        Driver.getDriver().switchTo().alert().accept();
        assertTrue(homePage.divSuccessYourDetailsHave.isDisplayed());
    }
    @Then("user click home link button and verifies that landes to home page successfully")
    public void user_click_home_link_button_and_verifies_that_landes_to_home_page_successfully() {
        homePage.linkHome.click();
    }
    @When("user clicks test cases button")
    public void user_clicks_test_cases_button() {
        homePage.linkTestCases.click();
    }
    @Then("user is navigated test cases page successfully")
    public void user_is_navigated_test_cases_page_successfully() {
     assertEquals(ConfigReader.getProperty("automationExerciseTestCasePage"), Driver.getDriver().getCurrentUrl());
    }
    @When("user clicks products page and is navigated all product page")
    public void user_clicks_products_page_and_is_navigated_all_product_page() {
        homePage.linkProducts.click();
        Driver.getDriver().navigate().refresh();
        homePage.linkProducts.click();
        assertEquals(ConfigReader.getProperty("automationExerciseProductsPage"), Driver.getDriver().getCurrentUrl());
    }
    @Then("user clicks on view product of first product and is landed to product detail page")
    public void user_clicks_on_view_product_of_first_product_and_is_landed_to_product_detail_page() {
        homePage.linkViewProduct.click();
    }
    @Then("use verifies product name, category, price, availability, condition and brand details are visible")
    public void use_verifies_product_name_category_price_availability_condition_and_brand_details_are_visible() {
        assertTrue(homePage.productName.isDisplayed());
        assertTrue(homePage.category.isDisplayed());
        assertTrue(homePage.availabilityStock.isDisplayed());
        assertTrue(homePage.condition.isDisplayed());
    }
    @Then("user enters {string} product name in search bar and clicks search button")
    public void user_enters_product_name_in_search_bar_and_clicks_search_button(String product) {
        homePage.inputSearchProduct.sendKeys(product);
        homePage.buttonSubmitSearch.click();
    }

    @Then("user sees SEARCHED PRODUCTS text is visible and verifies all the products related to {string} search")
    public void user_sees_searched_products_text_is_visible_and_verifies_all_the_products_related_to_search(String searchProduct) {
        assertTrue(homePage.h2SearchedProducts.isDisplayed());
    }
    @When("user verifies subscription box in the footer")
    public void user_verifies_subscription_box_in_the_footer() {
      scrollIntoView(homePage.subscriptionHeader);
      assertTrue(homePage.subscriptionHeader.isDisplayed());
    }
    @Then("user enters a subscribed email address and click button")
    public void user_enters_a_subscribed_email_address_and_click_button() {
        homePage.subscribeEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        homePage.subscribeButton.click();
    }
    @Then("user sees {string} message")
    public void user_sees_message(String message) {
        assertEquals(message, homePage.subscribedMailMessageText.getText());
    }

    @And("user clicks cart button")
    public void userClicksCartButton() {
        homePage.linkcart.click();
    }
}
