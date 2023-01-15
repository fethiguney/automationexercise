package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.automationexercise.com/
public class AutomationExercisePage {


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement linkSignupLogin;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement inputLoginEmail;




    public AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
