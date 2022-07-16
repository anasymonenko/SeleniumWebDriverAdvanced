package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchResultsPage extends BasketPage{

    String filterSectionXPath = "//label[text()='%s']//following-sibling::select";

    @FindBy (xpath = "/html/body/div[2]/div[5]/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div/a")
    private WebElement addToBasketButton;

    @FindBy (xpath = "//button[contains(text(), 'Refine results')]")
    private WebElement refineResultsButton;

    @FindBy (xpath = "//div[@class='book-item']")
    List<WebElement> allSearchResults;

    @FindBy (xpath = "//a[@class='btn btn-sm btn-primary add-to-basket' and @href = '/basket/addisbn/isbn13/9781684429097']")
    private WebElement preOrderButton;

    @FindBy (xpath = "//div[@class = 'primary-wrap']")
    private WebElement header;

    String preOrderButtonTemplate = "//a[@class='btn btn-sm btn-primary add-to-basket' and @href = '/basket/addisbn/isbn13/%s']";

    private static Map<String, String> bookInfo;

    static {
        bookInfo = new HashMap<>();
        bookInfo.put("Stranger Things Psychology", "9781684429097");
    }

    public void clickOnPreOrderButtonForSelectedBook(String bookName) {
        String bookIsbn = bookInfo.get(bookName);
        WebElement btn = header.findElement(By.xpath(String.format(preOrderButtonTemplate, bookIsbn)));
        btn.click();
    }

    public WebElement getAddToBasketButton(){
        return addToBasketButton;
    }

    public WebElement getRefineResultsButton(){
        return refineResultsButton;
    }

    public WebElement getPreOrderButton() {return preOrderButton;}

    public String formatLocatorForSearchDropDown(String filterName) {
        return String.format(filterSectionXPath, filterName);
    }

    public List<WebElement> getAllSearchResults() {
        return allSearchResults;
    }

    public void clickOnRefineResultsButton() {
        waitForElement(refineResultsButton, 30);
        refineResultsButton.click();
    }

    public void clickOnPreOrderButton() {
        waitForElement(preOrderButton, 30);
        preOrderButton.click();
    }
}
