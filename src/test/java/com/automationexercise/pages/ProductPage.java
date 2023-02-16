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


    public ProductPage() {PageFactory.initElements(Driver.getDriver(), this);    }
}
