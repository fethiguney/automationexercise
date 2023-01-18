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

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputLoginPassword;

    @FindBy(xpath = "//*[text() = 'Login']")
    public WebElement buttonLogin;

    @FindBy(xpath = "//*[text() = 'Login to your account']")
    public WebElement loginYourAccount;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement linkLoggedTest;

    @FindBy(xpath = "//*[text() = 'Your email or password is incorrect!']")
    public WebElement yourEmailPasswordIncorrect;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement linkLogout;



  

  
    




    public AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
