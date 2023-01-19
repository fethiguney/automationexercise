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

    @FindBy(xpath = "//*[text() = 'New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputSignupName;

    @FindBy(xpath = "//input[contains(@data-qa, 'signup-email')]")
    public WebElement inputSignupEmail;

    @FindBy(xpath = "//button[contains(@data-qa, 'signup-button')]")
    public WebElement buttonSignup;

    @FindBy(xpath = "//*[text() = 'Email Address already exist!']")
    public WebElement emailAddressAlreadyExist;


    
    
    

  



  

  
    




    public AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
