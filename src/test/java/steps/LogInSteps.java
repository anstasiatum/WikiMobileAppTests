package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.LogInPage;
import pages.MainPage;
import pages.components.MoreOptionsMenu;

public class LogInSteps {

    private final MainPage mainPage = new MainPage();
    private final MoreOptionsMenu moreOptionsMenu = new MoreOptionsMenu();
    private final LogInPage logInPage = new LogInPage();

    @Step
    @DisplayName("Open Log in page")
    public void openLogInPageStep() {
        mainPage.clickMoreOptions();
        moreOptionsMenu.clickLogIn();
    }

    @Step
    @DisplayName("Enter username")
    public void enterUsernameStep(String username) {
        logInPage.enterUsername(username);
    }

    @Step
    @DisplayName("Click Log in")
    public void clickLogInButtonIsEnabledStep(boolean shouldBeEnabled) {
        logInPage.checkLogInButtonIsEnabled(shouldBeEnabled);
    }
}
