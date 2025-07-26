package twentiethhometask.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import twentiethhometask.pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Step
    @DisplayName("Open the search text field")
    public void openSearchFieldStep() {
        mainPage.openSearchField();
    }
}
