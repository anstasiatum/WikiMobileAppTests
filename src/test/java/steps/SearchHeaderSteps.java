package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.components.SearchHeader;

public class SearchHeaderSteps {
    private final SearchHeader searchHeader = new SearchHeader();

    @Step
    @DisplayName("Enter query")
    public void enterSearchQueryStep(String searchQuery) {
        searchHeader.enterSearchQuery(searchQuery);
    }

    @Step
    @DisplayName("The search field contains the query")
    public void checkContentsOfSearchFieldStep(String expectedText) {
        searchHeader.checkSearchFieldContents(expectedText);
    }
}
