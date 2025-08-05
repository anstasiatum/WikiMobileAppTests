package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.LogInSteps;

public class LogInTests extends TestBase {
    private final LogInSteps logInSteps = new LogInSteps();
    private final Faker faker = new Faker();

    @Feature("Log in")
    @DisplayName("Log in button is disabled when password is empty")
    @Test
    void LogInButtonDisabledWhenPasswordIsEmptyTest() {
        logInSteps.openLogInPageStep();
        logInSteps.enterUsernameStep(faker.internet().emailAddress());
        logInSteps.clickLogInButtonIsEnabledStep(false);
    }
}
