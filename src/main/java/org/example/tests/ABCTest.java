package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.RegistrationPage;
import org.example.pages.SubscriptionPage;
import org.example.utils.TestProperties;
import org.testng.annotations.Test;



public class ABCTest extends BaseTest {


    @Test
    public void signUpTest() {
        driver.get(TestProperties.getProperty("url"));

        HomePage homePage = new HomePage(driver);
        homePage.verifyHomePageIsDisplayed();
        homePage.clickOnSignUpBtn();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.verifyRegistrationPageIsDisplayed();
        registrationPage.enterEmailAddress();
        registrationPage.clickOnSubmitBtn();
        SubscriptionPage subscriptionPage = new SubscriptionPage(driver);
        subscriptionPage.verifySubscriptionPageDisplayed();
    }

}
