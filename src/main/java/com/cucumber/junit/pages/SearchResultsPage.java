package com.cucumber.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasketPage{

    @FindBy (xpath = "/html/body/div[2]/div[5]/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div/a")
    private WebElement addToBasketButton;

    public WebElement getAddToBasketButton(){
        return addToBasketButton;
    }
}
