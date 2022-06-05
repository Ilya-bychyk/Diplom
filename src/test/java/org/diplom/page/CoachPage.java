package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoachPage extends BasePage {
    @FindBy (xpath = "//span[contains( text(),'14-DAY')][1]")
    private WebElement freeTrialButton;

    public CoachPage clickOnFreeTrialButton() {
        freeTrialButton.click();
        return this;
    }

    public CoachPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
