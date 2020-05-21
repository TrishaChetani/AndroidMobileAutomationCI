package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetNewPasswordPage extends BasePage  {

    By actionBar = By.id("action_bar");
    By newPassword = By.id("new_password_text");
    By confirmPassword = By.id("confirm_password_text");
    By confirmButton = By.id("confirm_button");
    By loginInputError = By.id("textinput_error");

    public SetNewPasswordPage(WebDriver driver) {
        super(driver);
    }

    @Step("User setup new password")
    public SetNewPasswordPage setNewPassword(String password) {
        waitForVisibilityOf(actionBar);
        driver.findElement(newPassword).clear();
        driver.findElement(newPassword).sendKeys(password);
        driver.findElement(confirmPassword).clear();
        driver.findElement(confirmPassword).sendKeys(password);
        driver.findElement(confirmButton).click();
        return new SetNewPasswordPage(driver);
    }
}
