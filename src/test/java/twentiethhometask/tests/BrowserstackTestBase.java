package twentiethhometask.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import twentiethhometask.browserstackhelpers.BrowserstackAttach;
import twentiethhometask.drivers.BrowserstackDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BrowserstackTestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = BrowserstackDriver.class.getName();
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        String sessionId = Selenide.sessionId().toString();

        BrowserstackAttach.pageSource();
        closeWebDriver();

        BrowserstackAttach.addVideo(sessionId);
    }
}
