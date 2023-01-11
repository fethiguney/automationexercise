package com.automationexercise.stepDefinitions;

import com.automationexercise.utilities.ConfigReader;
import com.automationexercise.utilities.Driver;
import io.cucumber.java.en.*;

public class AutomationStepDefinitions {

    @Given("user goes to automation exercise url")
    public void user_goes_to_automation_exercise_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise"));
    }
}
