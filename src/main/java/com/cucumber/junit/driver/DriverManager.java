package com.cucumber.junit.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Optional;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverManager {

    private static final int IMPLICIT_WAIT_TIMEOUT = 10;
    private static final int PAGE_LOAD_TIMEOUT = 20;
    private static final String CHROME_DRIVER_PATH = "src/main/resources/chromedriver.exe";
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private DriverManager(){
    }

    public static void setupDriver(){
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, SECONDS);
        webDriverThreadLocal.set(driver);
    }

    public static WebDriver getDriver(){
        return webDriverThreadLocal.get();
    }

    public static void quitDriver(){
        Optional.ofNullable(getDriver()).ifPresent(webDriver -> {
            webDriver.quit();
            webDriverThreadLocal.remove();
        });
    }
}
