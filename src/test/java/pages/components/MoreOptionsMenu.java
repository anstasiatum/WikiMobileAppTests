package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MoreOptionsMenu {
    private static final SelenideElement logInOption = $(id("org.wikipedia.alpha:id/explore_overflow_account_name"));

    public void clickLogIn() {
        logInOption.click();
    }
}
