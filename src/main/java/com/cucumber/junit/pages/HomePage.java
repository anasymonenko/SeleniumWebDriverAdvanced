package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String BOOK_DEPOSITORY_URL = "https://www.bookdepository.com/";

    public void openBookDepositoryWebsite(){
        DriverManager.getDriver().get(BOOK_DEPOSITORY_URL);
    }

    @FindBy (xpath = "//input[@name = 'searchTerm']")
    WebElement searchField;

    @FindBy (className = "header-search-btn") //(xpath = "//span[text()='Search']")
    WebElement searchButton;

    public WebElement getMenuSearchField(){
        return searchField;
    }

    public WebElement getSearchButton(){
        return searchButton;
    }

    public void searchForBook(String string) {
        Actions builder = new Actions(DriverManager.getDriver());
        Action searchBySearchTerm = builder
                .moveToElement(searchField)
                .click()
                .sendKeys(string)
                .moveToElement(searchButton)
                .click()
                .build();
        searchBySearchTerm.perform();
    }
}
