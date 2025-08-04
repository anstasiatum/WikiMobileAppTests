package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Step
    @DisplayName("Open the search text field")
    public void openSearchFieldStep() {
        mainPage.openSearchField();
    }

    @Step
    @DisplayName("Check In the news widget")
    public void checkInTheNewsHeaderStep(String expectedTitle) {
        mainPage.checkInTheNewsTitle(expectedTitle);
        mainPage.checkInTheNewsDateIsCorrect();
    }
}
