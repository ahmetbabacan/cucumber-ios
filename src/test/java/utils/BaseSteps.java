package utils;

import io.appium.java_client.ios.IOSDriver;

public class BaseSteps {

    public ConfigReader config;
    public IOSDriver<?> driver;

    public BaseSteps() {
        config = ConfigReader.getInstance();
    }
}
