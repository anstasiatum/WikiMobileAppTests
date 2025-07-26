package twentiethhometask.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import twentiethhometask.pages.ArticlePage;

public class ArticlePageSteps {
    private final ArticlePage articlePage = new ArticlePage();

    @Step
    @DisplayName("Check article name")
    public void checkArticleNameStep(String expectedName) {
        articlePage.checkArticleName(expectedName);
    }
}
