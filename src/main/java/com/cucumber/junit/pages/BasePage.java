package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    public String getPageUrl() {
        return DriverManager.getDriver().getCurrentUrl();
    }
}
