package twentiethhometask.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import twentiethhometask.pages.ArticlePage;
import twentiethhometask.pages.QueryResultPage;
import twentiethhometask.pages.MainPage;
import twentiethhometask.pages.components.SearchHeader;


public class Steps {
    private final MainPage mainPage = new MainPage();
    private final QueryResultPage queryResultPage = new QueryResultPage();
    private final SearchHeader searchHeader = new SearchHeader();
    private final ArticlePage articlePage = new ArticlePage();

    @Step
    @DisplayName("Open the search text field")
    public void openSearchFieldStep() {
        mainPage.openSearchField();
    }

    @Step
    @DisplayName("Enter query")
    public void enterSearchQueryStep(String searchQuery) {
        searchHeader.enterSearchQuery(searchQuery);
    }

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
    @Step
    @DisplayName("The search field contains the query")
    public void checkContentsOfSearchFieldStep(String expectedText) {
        searchHeader.checkSearchFieldContents(expectedText);
    }

    @Step
    @DisplayName("Check article name")
    public void checkArticleNameStep(String expectedName) {
        articlePage.checkArticleName(expectedName);
    }
}
