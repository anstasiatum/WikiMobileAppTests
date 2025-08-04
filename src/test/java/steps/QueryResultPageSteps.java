package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.QueryResultPage;

public class QueryResultPageSteps {
    private final QueryResultPage queryResultPage = new QueryResultPage();

    @Step
    @DisplayName("Verify content found")
    public void verifyContentFoundStep(boolean shouldHaveContents) {
        queryResultPage.searchResultPageContainsResults(shouldHaveContents);
    }

    @Step
    @DisplayName("Open the first article")
    public void openTheFirstArticleStep() {
        queryResultPage.openFirstSearchResult();
    }
}
