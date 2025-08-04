package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ArticlePageSteps;
import steps.MainPageSteps;
import steps.QueryResultPageSteps;
import steps.SearchHeaderSteps;

import static tests.TestData.searchQuery;

public class ArticleSearchTests extends TestBase {

    private final MainPageSteps mainPageSteps = new MainPageSteps();
    private final SearchHeaderSteps searchHeaderSteps = new SearchHeaderSteps();
    private final ArticlePageSteps articlePageSteps  = new ArticlePageSteps();
    private final QueryResultPageSteps queryResultPageSteps = new QueryResultPageSteps();

    @Feature("Search for an article")
    @Test
    @DisplayName("Open the first article from the search results")
    void successfulSearchTest() {
        mainPageSteps.openSearchFieldStep();
        searchHeaderSteps.enterSearchQueryStep(searchQuery);
        queryResultPageSteps.verifyContentFoundStep(true);
        searchHeaderSteps.checkContentsOfSearchFieldStep(searchQuery);
        queryResultPageSteps.openTheFirstArticleStep();
        articlePageSteps.checkArticleNameStep(searchQuery);
    }
}
