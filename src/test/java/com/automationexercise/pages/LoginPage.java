package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    @FindBy (css = "input[data-qa='signup-name']")
    public WebElement signupName;

    @FindBy (css = "input[data-qa='signup-email']")
    public WebElement singupEmail;

    @FindBy (css = "button[data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy (css = "div[class='radio-inline']")
    public List<WebElement> genderList;

    @FindBy (css = "input#password")
    public WebElement signupPassword;

    @FindBy (css = "input#first_name")
    public WebElement signupFirstName;

    @FindBy (css = "input#last_name")
    public WebElement signupLastName;

    @FindBy (css = "input#address1")
    public WebElement signupAdress;

    @FindBy (css = "select#country")
    public WebElement signupCountrySelectButton;

    @FindBy (css = "input#state")
    public WebElement signupState;

    @FindBy (css = "input#city")
    public WebElement signupCity;

    @FindBy (css = "input#zipcode")
    public WebElement signupZipCode;

    @FindBy (css = "input#mobile_number")
    public WebElement signupMobileNumber;

    @FindBy (css = "button[data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAsText;

    @FindBy (xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy (xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;





    public LoginPage() {PageFactory.initElements(Driver.getDriver(), this); }
}
