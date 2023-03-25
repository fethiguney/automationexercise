package com.automationexercise.stepDefinitions;


import com.automationexercise.utilities.Driver;
import com.automationexercise.utilities.ReusableMethods;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Hooks {

    private Scenario scenario;
    @Before
    public void setUp(Scenario scenario) {
        this.scenario = scenario;

    }
    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        String screenshotPath = ReusableMethods.screenshotAddReport();
        byte[] screenshot = Files.readAllBytes(Paths.get(screenshotPath));
        scenario.attach(screenshot, "image/png", "Screenshot");
    }
    @After
    public void tearDown(Scenario scenario){ final byte[]screenshot=((TakesScreenshot)
            Driver.getDriver()).getScreenshotAs(OutputType.BYTES); if (scenario.isFailed()){
        scenario.attach(screenshot,"image/png","screenshots");
    }
        Driver.closeDriver();
    }
}
