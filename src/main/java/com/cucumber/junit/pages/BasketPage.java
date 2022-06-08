package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy (xpath = "//p[@class = 'item-total']")
    private WebElement itemTotal;

    @FindBy (xpath = "//dl[@class = 'total']/dd")
    private WebElement basketTotal;

    @FindBy (xpath = "//div[@class = 'checkout-btns-wrap']/a[@href = '/payment/guest' and text() = 'Checkout']")
    private WebElement checkoutButton;

    public WebElement getItemTotal(){
        return itemTotal;
    }

    public WebElement getBasketTotal(){
        return basketTotal;
    }

    public WebElement getCheckoutButton(){
        return checkoutButton;
    }
}
