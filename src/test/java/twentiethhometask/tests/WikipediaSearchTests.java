package twentiethhometask.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import twentiethhometask.steps.ArticlePageSteps;
import twentiethhometask.steps.MainPageSteps;
import twentiethhometask.steps.QueryResultPageSteps;
import twentiethhometask.steps.SearchHeaderSteps;

import static twentiethhometask.tests.TestData.searchQuery;

public class WikipediaSearchTests extends TestBase {

    private final MainPageSteps mainPageSteps = new MainPageSteps();
    private final SearchHeaderSteps searchHeaderSteps = new SearchHeaderSteps();
    private final ArticlePageSteps articlePageSteps  = new ArticlePageSteps();
    private final QueryResultPageSteps queryResultPageSteps = new QueryResultPageSteps();

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
