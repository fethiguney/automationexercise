package com.automationexercise.stepDefinitions;

import com.automationexercise.pages.AutomationExercisePage;
import com.automationexercise.utilities.ConfigReader;
import com.automationexercise.utilities.Driver;
import io.cucumber.java.en.*;

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
        automationExercisePage.inputLoginEmail.sendKeys(ConfigReader.getProperty("validUserName"));
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


}
