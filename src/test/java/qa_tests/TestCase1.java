package qa_tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class TestCase1 extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homePage = new HomePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();






    @Test
    public void sampleMethodForEnteringCredentials(){
        logger.info("SignIn into LoginPage");

        homePage.signInButton();
        logger.info("Verifying if Login text is present or not");
        loginPage.verifyIfLoginPageIsLoaded();
        logger.info("Enter the credentials");
        loginPage.enterCredentials();

    }
}
