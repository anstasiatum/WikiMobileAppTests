package twentiethhometask.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import twentiethhometask.steps.Steps;

public class WikipediaSearchTests extends BrowserstackTestBase {

    Steps steps = new Steps();

    @Test
    @DisplayName("Open the first article from the search results")
    void successfulSearchTest() {
        final String searchQuery = "Docker";
        steps.openSearchFieldStep();
        steps.enterSearchQueryStep(searchQuery);
        steps.verifyContentFoundStep(true);
        steps.checkContentsOfSearchFieldStep(searchQuery);
        steps.openTheFirstArticleStep();
        steps.checkArticleNameStep("Docker");
    }
}
