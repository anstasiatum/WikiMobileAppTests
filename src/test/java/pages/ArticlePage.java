package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.className;

public class ArticlePage {
    private final ElementsCollection articleName = $$(className("android.widget.TextView"));

    public void checkArticleName(String expectedName) {
        articleName
                .findBy(text(expectedName))
                .shouldBe(visible);
    }
}
