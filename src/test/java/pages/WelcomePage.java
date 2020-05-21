package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WelcomePage extends BasePage  {
    By signInButton = By.id("login_button");
    By nextButtonText = By.id("next_button");
    By startButton = By.id("start_button");


    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Step("User navigate to through welcome screen taping next button")
    public WelcomePage signInButton() {
        waitForVisibilityOf(nextButtonText);
        driver.findElement(nextButtonText).click();
        driver.findElement(nextButtonText).click();
        waitForVisibilityOf(startButton);
        driver.findElement(startButton).click();
        return new WelcomePage(driver);
    }
}
