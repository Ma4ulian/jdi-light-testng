package org.mytests.uiobjects.example.site.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePageRozetka{

    @FindBy(xpath = "//div[@class='catalog']//h1[contains(text(),'test')]")
    private WebElement searchResultsProductsListText;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchResultsList() {
        return searchResultsProductsListText.getText();
    }
}
