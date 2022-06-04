package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoachPage extends BasePage {
    @FindBy (xpath = "//span[contains( text(),'14-DAY')][1]")
    private WebElement FreeTrialButton;

    public void clickOnFreeTrialButton() {
        FreeTrialButton.click();
    }
}
