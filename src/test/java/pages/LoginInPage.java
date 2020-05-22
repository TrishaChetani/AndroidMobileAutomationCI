package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInPage extends BasePage {


    By companyLogo = By.id("company_logo");
    By emailId = By.id("email_text");
    By password = By.id("password_text");
    By loginButton = By.id("login_button");
    By loginInputError = By.id("textinput_error");




    public LoginInPage(WebDriver driver) {
        super(driver);
    }

    @Step("User signin to app using userId and password")
    public LoginInPage loginInApplication(String id, String pass) {
        waitForVisibilityOf(companyLogo);
        driver.findElement(emailId).clear();
        driver.findElement(emailId).sendKeys(id);
        driver.navigate().back();
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.navigate().back();
       // Assert.assertNull(driver.findElements(LoginInputError));
        driver.findElement(loginButton).click();
        return new LoginInPage(driver);
    }
}
