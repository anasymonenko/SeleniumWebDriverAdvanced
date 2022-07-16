package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.util.WebDriverWaiter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.Map;

public class BasePage extends WebDriverWaiter {

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    public String getPageUrl() {
        return DriverManager.getDriver().getCurrentUrl();
    }

    private static Map<String, String> expectedUrlList;

    static {
        expectedUrlList = new HashMap<>();
        expectedUrlList.put("Search results", "https://www.bookdepository.com/search?searchTerm=Stranger+things&search=Find+book");
        expectedUrlList.put("Basket page", "https://www.bookdepository.com/basket");
        expectedUrlList.put("Checkout", "https://www.bookdepository.com/payment/guest");
    }

    public static String getExpectedUrlTitle(String string) {
        return expectedUrlList.get(string);
    }

    public void exitFrame() {
        DriverManager.getDriver().switchTo().defaultContent();
    }

    public Select getNewSelect(WebElement element) {
        return new Select(element);
    }

    public void switchToFrame(WebElement frameName) {
        DriverManager.getDriver().switchTo().frame(frameName);
    }
}
