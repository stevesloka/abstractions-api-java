package demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppVersion {

    private String appVersion;

    public AppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
