package twentiethhometask.drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import twentiethhometask.config.BrowserstackConfig;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities)  {
        MutableCapabilities caps = new MutableCapabilities();
        BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);

        caps.setCapability("browserstack.user", config.getUserName());
        caps.setCapability("browserstack.key", config.getAccessKey());

        caps.setCapability("app", config.getApp());

        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOSValue());

        caps.setCapability("project", config.getProjectName());
        caps.setCapability("build", config.getBuildName());
        caps.setCapability("name", config.getSessionName());

        try {
            return new RemoteWebDriver(
                    new URL(config.getHubURL()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
