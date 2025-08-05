package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class QueryResultPage {
    private static final ElementsCollection searchResults = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public void searchResultPageContainsResults(boolean shouldHaveResults) {
        searchResults.shouldHave(sizeGreaterThan(0));
    }

    public void openFirstSearchResult() {
        searchResults
                .first()
                .click();
    }
}
