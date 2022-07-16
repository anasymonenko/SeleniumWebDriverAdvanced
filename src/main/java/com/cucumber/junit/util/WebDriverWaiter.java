package com.cucumber.junit.util;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaiter {

    public WebDriverWaiter waitForElement(WebElement element, long seconds){
        getWebDriverWait(seconds).until(elementIsDisplayed(element));
        return this;
    }

    public WebDriverWait getWebDriverWait(long seconds) {
        return new WebDriverWait(DriverManager.getDriver(), seconds);
    }

    public ExpectedCondition<Boolean> elementIsDisplayed(WebElement element) {
        return driver -> element.isDisplayed();
    }
}
