package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy (css = "textarea[class='form-control']")
    public WebElement checkoutTextArea;

    @FindBy (xpath = "//a[@href='/payment']")
    public WebElement placeOrderButton;

    @FindBy (css = "input[name='name_on_card']")
    public WebElement nameOnCardBar;

    @FindBy (css = "input[name='card_number']")
    public WebElement cardNumberBar;

    @FindBy (css = "input[name='cvc']")
    public WebElement cvcCardBar;

    @FindBy (css = "input[name='expiry_month']")
    public WebElement expiryMonthCardBar;

    @FindBy (css = "input[name='expiry_year']")
    public WebElement expiryYearCardBar;

    @FindBy (css = "button[data-qa='pay-button']")
    public WebElement payAndOrderConfirmButton;

    @FindBy (css = "div#success_message")
    public WebElement orderPlacedSuccessfullyText;





    public ProductPage() {PageFactory.initElements(Driver.getDriver(), this);    }
}
