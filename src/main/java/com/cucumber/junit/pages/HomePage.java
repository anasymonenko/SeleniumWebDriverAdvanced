package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String BOOK_DEPOSITORY_URL = "https://www.bookdepository.com/";

    public void openBookDepositoryWebsite(){
        DriverManager.getDriver().get(BOOK_DEPOSITORY_URL);
    }

    @FindBy (xpath = "//input[@name = 'searchTerm']")
    WebElement searchField;

    @FindBy (xpath = "//span[text()='Search']")
    WebElement searchButton;

    public WebElement getMenuSearchField(){
        return searchField;
    }

    public WebElement getSearchButton(){
        return searchButton;
    }
}
