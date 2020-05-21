package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepsPage extends BasePage {
    By addCountButton = By.id("activityAddCountButton");
    By stepCount = By.id("stepsInput");
    By saveSteps = By.id("actionSaveSteps");


    public StepsPage (WebDriver driver) {
        super(driver);
    }

    @Step("User add the steps")
    public StepsPage saveStepsCount(String id) {
        waitForVisibilityOf(addCountButton);
        driver.findElement(addCountButton).click();
        driver.findElement(stepCount).sendKeys(id);
        waitForVisibilityOf(saveSteps);
        driver.findElement(saveSteps).click();
        return new StepsPage (driver);
    }
}
