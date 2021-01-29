package org.mytests.tests.rozetka;

import org.mytests.uiobjects.example.site.pages.BasePageRozetka;
import org.mytests.uiobjects.example.site.pages.HomePageRozetka;
import org.mytests.uiobjects.example.site.pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;
    private static final String URL = "https://rozetka.com.ua/";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePageRozetka getBasePageRozetka() {
        return new BasePageRozetka(getDriver());
    }
    public HomePageRozetka getHomePageRozetka() {
        return new HomePageRozetka(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }
}
