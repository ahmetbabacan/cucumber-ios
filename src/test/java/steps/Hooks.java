package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.BaseSteps;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends BaseSteps {

    private BaseSteps base;
    private String APP = "/Users/ahmetbabacan/Desktop/cucumber-example-ios/src/test/java/driver/.app";
    private String url = "http://127.0.0.1:4723/wd/hub";

    public Hooks(BaseSteps base) {
        this.base = base;
    }

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "iPhone XR");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "12.2");
        caps.setCapability("udid", "4FDBAA9D-1F17-4DBC-8D18-46B4B82FB391");
        caps.setCapability("bundleId", "com.dsmart.D-Smart-BLU-iPhone");
        caps.setCapability("app", APP);
        caps.setCapability("appName", "BluTv_iphone");

        base.driver = new IOSDriver(new URL(url), caps);
    }

    @After
    public void after() {

    }
}
