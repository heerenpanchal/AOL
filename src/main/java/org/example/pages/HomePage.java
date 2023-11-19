package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sign-up-button")
    private WebElement signUpBtn;

    public void verifyHomePageIsDisplayed() {
        signUpBtn.isDisplayed();
    }

    public void clickOnSignUpBtn() {
        signUpBtn.click();
    }
}
