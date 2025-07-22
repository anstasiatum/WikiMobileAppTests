package twentiethhometask.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import twentiethhometask.steps.Steps;

import static twentiethhometask.tests.TestData.searchQuery;

public class WikipediaSearchTests extends BrowserstackTestBase {

    private final Steps steps = new Steps();

    @Test
    @DisplayName("Open the first article from the search results")
    void successfulSearchTest() {
        steps.openSearchFieldStep();
        steps.enterSearchQueryStep(searchQuery);
        steps.verifyContentFoundStep(true);
        steps.checkContentsOfSearchFieldStep(searchQuery);
        steps.openTheFirstArticleStep();
        steps.checkArticleNameStep(searchQuery);
    }
}
