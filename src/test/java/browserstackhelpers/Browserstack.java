package browserstackhelpers;

import org.aeonbits.owner.ConfigFactory;
import config.BrowserstackConfig;

import static io.restassured.RestAssured.given;

public class Browserstack {

    public static String videoUrl(String sessionId) {
        BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(config.getUserName(), config.getAccessKey())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
