package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends BasePage {
    public SubscriptionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "offer-text-container")
    private WebElement offerText;

    public void verifySubscriptionPageDisplayed() {
        offerText.isDisplayed();
    }
}
