package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.EmulatorDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import browserstackhelpers.BrowserstackAttach;
import drivers.BrowserstackDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static config.Environment.BROWSERSTACK;
import static config.Environment.EMULATOR;

public class TestBase {

    private static final String env = System.getProperty("env", "emulator");

    @BeforeAll
    static void configurationSetUp () {

        if (env.equals(BROWSERSTACK.getDisplayName())) {
            Configuration.browser = BrowserstackDriver.class.getName();
        } else if (env.equals(EMULATOR.getDisplayName())) {
            Configuration.browser = EmulatorDriver.class.getName();
        } else {
            throw new IllegalArgumentException("Unsupported env: " + env);
        }

        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void listenerSetUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        if (env.equals(BROWSERSTACK.getDisplayName())) {
            String sessionId = Selenide.sessionId().toString();
            System.out.println(sessionId);
            BrowserstackAttach.pageSource();
            closeWebDriver();

            BrowserstackAttach.addVideo(sessionId);
        }
    }
}
