package org.diplom.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CoachPage extends BasePage {
    @FindBy (xpath = "//span[contains( text(),'14-DAY')][1]")
    private WebElement freeTrialButton;

    public void clickOnFreeTrialButton() {
        log.info("Click on Free Trial button");
        freeTrialButton.click();
    }

    public CoachPage openPage(String url) {
        log.info("Open Coach Page");
        driver.get(url);
        return this;
    }

    public String getCurrentUrl() {
        log.info("Getting url of current page");
        return driver.getCurrentUrl();
    }
}
