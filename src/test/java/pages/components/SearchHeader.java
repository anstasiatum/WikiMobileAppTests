package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SearchHeader {
    public static final SelenideElement searchTextField = $(id("org.wikipedia.alpha:id/search_src_text"));

    public void enterSearchQuery(String searchQuery) {
        searchTextField.sendKeys(searchQuery);
    }
    public void checkSearchFieldContents(String expectedText) {
        searchTextField.shouldHave(text(expectedText));
    }
}
