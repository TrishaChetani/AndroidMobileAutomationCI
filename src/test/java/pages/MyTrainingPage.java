package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyTrainingPage extends BasePage{
    By trainingText = By.id("title_my_training_text");
    By goButton = By.id("my_training_arrow");
    By readyButton = By.id("com.casparhealth.android.patient:id/ready_button");
    By yesButton = By.id("com.casparhealth.android.patient:id/yes_button");
    By startButton = By.id("com.casparhealth.android.patient:id/start_button");
    By totalProgress = By.id("com.casparhealth.android.patient:id/totalProgress");
    By skipButton = By.id("com.casparhealth.android.patient:id/skip_button");
    By closeButton = By.id("com.casparhealth.android.patient:id/close_button");
    By skipPopup = By.id("com.casparhealth.android.patient:id/skip");





    public MyTrainingPage(WebDriver driver){

        super(driver);
    }
    @Step("User navigate through the training page")
    public MyTrainingPage clickOnGoButton() throws InterruptedException {
       waitForVisibilityOf(trainingText);
        waitForVisibilityOf(goButton);
        driver.findElement(goButton).click();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        waitForVisibilityOf(readyButton);
        driver.findElement(readyButton).click();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        if(!driver.findElements(yesButton).isEmpty()) {
            driver.findElement(yesButton).click();
        }
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        if(!driver.findElements(yesButton).isEmpty()) {
            driver.findElement(yesButton).click();
        }
        waitForVisibilityOf(skipButton);
        driver.findElement(skipButton).click();
        waitForVisibilityOf(skipPopup);
        driver.findElement(skipPopup).click();
        waitForVisibilityOf(closeButton);
        driver.findElement(closeButton).click();
        waitForVisibilityOf(skipPopup);
        driver.findElement(skipPopup).click();
        return new MyTrainingPage(driver);
    }
}
