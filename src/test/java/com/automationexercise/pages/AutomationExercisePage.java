package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//*[text() = ' Contact us']")
    public WebElement linkContact;

    @FindBy(xpath = "//*[text() = 'Get In Touch']")
    public WebElement h2GetTouch;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement inputName;

    @FindBy(xpath = "//input[@data-qa='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement inputSubject;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement textareaMessage;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement inputSubmitButton;

    @FindBy(xpath = "//*[text() = 'Success! Your details have been submitted successfully.']")
    public WebElement divSuccessYourDetailsHave;

    @FindBy(xpath = "//*[text() = ' Home']")
    public WebElement linkHome;

    @FindBy(xpath = "//*[text() = ' Test Cases']")
    public WebElement linkTestCases;

    @FindBy(xpath = "//a[contains(@href, '/products')]")
    public WebElement linkProducts;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement linkViewProduct;

    @FindBy(css = "div[class='product-information'] h2")
    public WebElement productName;
    
    @FindBy (xpath = "(//div[@class='product-information']//p)[1]")
    public WebElement category;

    @FindBy(xpath = "//*[text()='Availability:']")
    public WebElement availabilityStock;

    @FindBy(xpath = "//*[text() = 'Condition:']")
    public WebElement condition;

    @FindBy(xpath = "//*[text() = 'Brand:']")
    public WebElement bBrand;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement inputSearchProduct;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement buttonSubmitSearch;

    @FindBy(xpath = "//*[text() = 'Searched Products']")
    public WebElement h2SearchedProducts;

    @FindBy(xpath = "//div[@class='product-overlay']//p")
    public List<WebElement> searchedProducts;

    @FindBy (xpath = "//*[text()='Subscription']")
    public WebElement subscriptionHeader;

    @FindBy (xpath = "//input[@id='susbscribe_email']")
    public WebElement subscribeEmail;

    @FindBy (xpath = "//button[@id='subscribe']")
    public WebElement subscribeButton;

    @FindBy (xpath = "//div[text()='You have been successfully subscribed!']")
    public WebElement subscribedMailMessageText;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement linkcart;

    @FindBy (xpath = "//div[@class='product-overlay']")
    public List<WebElement> productOverLaysList;

    @FindBy (xpath = "//div[@class='overlay-content']//a")
    public List<WebElement> addToCartButtonList;

    @FindBy (xpath = "//div[@class='overlay-content']//p")
    public List<WebElement> productsNameList;

    @FindBy (xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy (xpath = "//tbody//td[2]//a")
    public List<WebElement> productNamesAddedCart;

    @FindBy (xpath = "//div[@class='choose']//a")
    public List<WebElement> viewProductHomePageLinks;

    @FindBy (xpath = "//input[@id='product_id']")
    public WebElement quantityIncreaseButton;

    @FindBy (xpath = "//input[@id='quantity']")
    public WebElement quantityOfProduct;

    @FindBy (xpath = "//button[@type='button']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//tbody//td[4]//button")
    public List<WebElement> cartQuantityList;

    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy (xpath = "//u[text()='Register / Login']")
    public WebElement registerLoginButton;



   


    public AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
