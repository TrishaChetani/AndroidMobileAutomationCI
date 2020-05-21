package pages;

import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTrainingPage extends BasePage{
    By trainingText = By.id("title_my_training_text");
    By goButton = By.id("my_training_arrow");
    By readyButton = By.id("ready_button");
    By yesButton = By.id("yes_button");
    By startButton = By.id("start_button");
    By totalProgress = By.id("com.casparhealth.android.patient:id/totalProgress");
    By skipButton = By.id("com.casparhealth.android.patient:id/skip_button");
    By closeButton = By.id("com.casparhealth.android.patient:id/close_button");
    By skipPopup = By.id("skip");





    public MyTrainingPage(WebDriver driver){
        super(driver);
    }
    @Step("User navigate through the training page")
    public MyTrainingPage clickOnGoButton() {
        waitForVisibilityOf(trainingText);
        waitForVisibilityOf(goButton);
        driver.findElement(goButton).click();
        waitForVisibilityOf(readyButton);
        driver.findElement(readyButton).click();
        waitForVisibilityOf(yesButton);
        driver.findElement(yesButton).click();
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
