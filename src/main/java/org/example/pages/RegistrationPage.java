package org.example.pages;

import org.example.utils.TestProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "become-member")
    private WebElement becomeAMemberTitle;

    @FindBy(id = "email")
    private WebElement emailTextbox;

    @FindBy(id = "submit-button")
    private WebElement submitBtn;

    public void verifyRegistrationPageIsDisplayed() {
        becomeAMemberTitle.isDisplayed();
    }

    public void enterEmailAddress() {
        emailTextbox.sendKeys(TestProperties.getProperty("email"));
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }
}
