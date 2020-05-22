package setup;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LocalSetUp extends BrowserStackTestNGTest {
    protected AppiumDriver<MobileElement> driver;
    public static final String USERNAME = "trisha11";
    public static final String AUTOMATE_KEY = "XMezhPScCXges6fqYv4R";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeSuite
    public void androidSetUpForAppium() throws MalformedURLException {
        try {
            DesiredCapabilities desiredCapablities = new DesiredCapabilities();

            String platform = "android";

            if (platform.equalsIgnoreCase("android")) {
                desiredCapablities.setCapability("platformName", "Android");
                DesiredCapabilities caps = new DesiredCapabilities();
                desiredCapablities.setCapability("os_version", "7.0");
                desiredCapablities.setCapability("device", "Samsung Galaxy S8");
                desiredCapablities.setCapability("real_mobile", "true");
                desiredCapablities.setCapability("browserstack.appium_version", "1.15.0");
                desiredCapablities.setCapability("browserstack.local", "true");
                desiredCapablities.setCapability("browserstack.debug", "true");
                desiredCapablities.setCapability("browserstack.console", "info");
                desiredCapablities.setCapability("automationName", "uiautomator2");
                desiredCapablities.setCapability("appPackage", "com.casparhealth.android.patient");
                desiredCapablities.setCapability("appActivity", "com.casparhealth.android.patient.splash.SplashActivity");
            } else if (platform.equalsIgnoreCase("ios")) {
                desiredCapablities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                desiredCapablities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.5");
                desiredCapablities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
                desiredCapablities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
            }
            File app = new File("bs://a8685afd141207c2c23cfad5d18b4d349d7c1a00");
            desiredCapablities.setCapability("app", app.getAbsolutePath());
            URL url = new URL(URL);
            driver = new AppiumDriver<MobileElement>(url, desiredCapablities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception exception) {
            System.out.println("Cause is : " + exception.getCause());
            System.out.println("Message is : " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @AfterSuite
    public void teardown() {
        driver.resetApp();
    }
}