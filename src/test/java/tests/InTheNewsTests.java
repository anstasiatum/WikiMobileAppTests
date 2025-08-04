package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.MainPageSteps;

public class InTheNewsTests extends TestBase {

    private final MainPageSteps mainPageSteps = new MainPageSteps();

    @Feature("In the news")
    @DisplayName("In the news appears on the main page and has correct title and date")
    @Test
    void inTheNewsWidgetTest() {
        mainPageSteps.checkInTheNewsHeaderStep("In The News");
    }
}
