package org.diplom.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Log4j2
public class WorkoutPlansPage extends BasePage {

    @FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
    private WebElement routineNameCheckbox;

    @FindBy (xpath = "//a[contains(text(), 'Blog')]")
    private WebElement blogButton;

    @Step("Verify checkbox status")
    public boolean checkboxVerify() {
        log.info("Verify checkbox status");
        return routineNameCheckbox.isSelected();
    }

    @Step("Click on button Page Number")
    public void clickOnPageNumberButton() {
        log.info("Click on button Page Number");
        blogButton.click();
    }

    @Step("Open Page Workout Plans")
    public WorkoutPlansPage openPage(String url) {
        log.info("Open Page Workout Plans");
        driver.get(url);
        return this;
    }

    @Step("Getting url of current page")
    public String getCurrentUrl() {
        log.info("Getting url of current page");
        return driver.getCurrentUrl();
    }
}
