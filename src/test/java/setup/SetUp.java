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

public class SetUp {
    protected AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void androidSetUpForAppium() throws MalformedURLException {
        try {
            DesiredCapabilities desiredCapablities = new DesiredCapabilities();

            String platform = "android";

            if (platform.equalsIgnoreCase("android")) {
                desiredCapablities.setCapability("platformName", "Android");
                desiredCapablities.setCapability("deviceName", "78cd4aa1");
                desiredCapablities.setCapability("automationName", "uiautomator2");
                desiredCapablities.setCapability("appPackage", "com.casparhealth.android.patient");
                desiredCapablities.setCapability("appActivity", "com.casparhealth.android.patient.splash.SplashActivity");
            } else if (platform.equalsIgnoreCase("ios")) {
                desiredCapablities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                desiredCapablities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.5");
                desiredCapablities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
                desiredCapablities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
            }
            File app = new File("/Users/chetatri/Desktop/mobile/Casper-health/src/test/resources/Caspar.apk");
            desiredCapablities.setCapability("app", app.getAbsolutePath());
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
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