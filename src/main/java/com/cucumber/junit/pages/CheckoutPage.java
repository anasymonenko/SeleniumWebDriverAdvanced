package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy (name = "emailAddress")
    private WebElement emailInput;

    @FindBy (xpath = "//dd[@class = 'text-right total-price']")
    private WebElement orderSummaryTotal;

    @FindBy (xpath = "//dd[@class = 'text-right']")
    private WebElement orderSummarySubtotal;

    public WebElement getEmailInput(){
        return emailInput;
    }

    public WebElement getOrderSummaryTotal(){
        return orderSummaryTotal;
    }

    public WebElement getOrderSummarySubtotal(){
        return orderSummarySubtotal;
    }
}
