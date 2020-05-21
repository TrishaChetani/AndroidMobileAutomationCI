package test;


import com.aventstack.extentreports.TestListener;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.*;
import pages.*;
import setup.SetUp;

public class TestCases extends SetUp {

    @BeforeTest
    @Parameters({"id", "pass"})
    public void login(String id, String pass) throws Exception {
        new WelcomePage(driver).signInButton();
        new LoginInPage(driver).loginInApplication(id, pass);
        // Set password, Consent functionality are used only first time when users login
        /* new SetNewPassword(driver).setNewPassword(pass);
         new ConsentPage(driver).clickCheckBox(); */
    }

    @AfterTest
    public void logout() throws Exception {
        new LogoutPages(driver).logout();
    }
    @Parameters({"pass"})
    @Test (priority = 0, description="User sign in and navigate to training section and save the steps")
    @Feature("Flow")
    @Story("Multiple")
    @Description("Test Description: User sign in and navigate to training section and save the steps")

    public void navigateSignPage(String id) throws Exception {
        new MyTrainingPage(driver).clickOnGoButton();
        new StepsPage(driver).saveStepsCount(id);

    }


}

