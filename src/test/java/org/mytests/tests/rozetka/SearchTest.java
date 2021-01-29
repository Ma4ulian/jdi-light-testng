package org.mytests.tests.rozetka;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest{

    private String SEARCH_KEYWORD = "test";

    @Test
    public void checkThatSearchPageContainsSearchWord() {
        getHomePageRozetka().searchByKeyword(SEARCH_KEYWORD);
        getHomePageRozetka().waitForPageLoadComplete(30);
        assertTrue(getSearchResultsPage().getSearchResultsList().contains(SEARCH_KEYWORD));
    }
}
