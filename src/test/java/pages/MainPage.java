package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    private static final SelenideElement searchButton = $(accessibilityId("Search Wikipedia"));
    private static final SelenideElement inTheNewsTitle = $(id("org.wikipedia.alpha:id/view_card_header_title"));
    private static final SelenideElement inTheNewsDate = $(id("org.wikipedia.alpha:id/view_card_header_subtitle"));
    private static final SelenideElement moreOptionsButton = $(id("org.wikipedia.alpha:id/menu_overflow_button"));

    public void openSearchField() {
        searchButton.click();
    }

    public void checkInTheNewsTitle(String expectedTitle) {
        inTheNewsTitle.shouldBe(Condition.visible);
        inTheNewsTitle.shouldHave(text(expectedTitle));
    }

    public void checkInTheNewsDateIsCorrect() {
        inTheNewsDate.shouldBe(visible);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH);
        String dateText = inTheNewsDate.getText().trim();

        LocalDate parsedDate;
        try {
            parsedDate = LocalDate.parse(dateText, formatter);
        } catch (DateTimeParseException e) {
            throw new AssertionError("Date format is invalid: '" + dateText + "'", e);
        }

        LocalDate today = LocalDate.now();
        assert parsedDate.equals(today) : "Expected today's date: " + today + ", but found: " + parsedDate;
    }

    public void clickMoreOptions() {
        moreOptionsButton.click();
    }
}
