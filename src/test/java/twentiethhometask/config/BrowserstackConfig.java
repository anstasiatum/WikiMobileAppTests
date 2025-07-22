package twentiethhometask.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${platform}.properties"
})

public interface BrowserstackConfig extends Config {

    @Key("browserstack.userName")
    @DefaultValue("anastasiyatumako_1bZRWy")
    String getUserName();

    @Key("browserstack.accessKey")
    @DefaultValue("VUZLPg4b4BKfxYSKVfFi")
    String getAccessKey();

    @Key("browserstack.app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("browserstack.device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("browserstack.osValue")
    @DefaultValue("9.0")
    String getOSValue();

    @Key("browserstack.projectName")
    @DefaultValue("Wikipedia Mobile App Test")
    String getProjectName();

    @Key("browserstack.buildName")
    @DefaultValue("browserstack-build")
    String getBuildName();

    @Key("browserstack.sessionName")
    @DefaultValue("first_test")
    String getSessionName();

    @Key("browserstack.hubURL")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getHubURL();
}
