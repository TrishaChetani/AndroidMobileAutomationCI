package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPages extends BasePage{
    By menuIcon = By.id("action_more");
    By logoutOptions = By.id("logout");


    public LogoutPages(WebDriver driver) {
        super(driver);
    }

    @Step("User logout from the app")
    public LogoutPages logout() {
        waitForVisibilityOf(menuIcon);
        driver.findElement(menuIcon).click();
        waitForVisibilityOf(logoutOptions);
        driver.findElement(logoutOptions).click();
        return new LogoutPages(driver);
    }
}
