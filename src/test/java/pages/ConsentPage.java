package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsentPage extends BasePage{
    By actionBarContainer = By.id("action_bar_container");
    By checkBox = By.id("agree_check_box");


    public ConsentPage(WebDriver driver) {
        super(driver);
    }

    @Step("User accept the consent")
    public ConsentPage clickCheckBox() {
        waitForVisibilityOf(actionBarContainer);
        waitForVisibilityOf(checkBox);
        driver.findElement(checkBox).click();
        return new ConsentPage(driver);
    }
}
