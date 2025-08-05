package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogInPage {
    private static final SelenideElement usernameTextField = $(id("org.wikipedia.alpha:id/login_username_text"));
    private static final SelenideElement logInButton = $(id("org.wikipedia.alpha:id/login_button"));


    public void enterUsername(String username) {
        usernameTextField.sendKeys(username);
    }

    public void checkLogInButtonIsEnabled(boolean shouldBeEnabled) {
        boolean isClickable = Boolean.parseBoolean(logInButton.getAttribute("enabled"));

        if (shouldBeEnabled) {
            assertTrue(isClickable);
        } else {
            assertFalse(isClickable);
        }
    }
}
