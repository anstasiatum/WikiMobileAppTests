package twentiethhometask.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:default.properties"
})

public interface BrowserstackConfig extends Config {

    @Key("browserstack.userName")
    String getUserName();

    @Key("browserstack.accessKey")
    String getAccessKey();

    @Key("browserstack.app")
    String getApp();

    @Key("browserstack.device")
    String getDevice();

    @Key("browserstack.osValue")
    String getOSValue();

    @Key("browserstack.projectName")
    String getProjectName();

    @Key("browserstack.buildName")
    String getBuildName();

    @Key("browserstack.sessionName")
    String getSessionName();

    @Key("browserstack.hubURL")
    String getHubURL();

    @Key("browserstack.platformName")
    String getPlatformName();
}
