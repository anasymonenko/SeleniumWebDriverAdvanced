package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPopUp extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'Basket / Checkout')]")
    private WebElement basketCheckoutButton;

    public WebElement getBasketCheckoutButton(){
        return basketCheckoutButton;
    }

}
