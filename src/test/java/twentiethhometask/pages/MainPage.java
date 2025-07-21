package twentiethhometask.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class MainPage {
    public static final SelenideElement searchButton = $(accessibilityId("Search Wikipedia"));

    public void openSearchField() {
        searchButton.click();
    }
}
