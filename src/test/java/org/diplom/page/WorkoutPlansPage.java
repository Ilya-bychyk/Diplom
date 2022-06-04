package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkoutPlansPage extends BasePage {

    @FindBy(xpath = "///tbody/tr[1]/td[4]/input[1]")
    private WebElement routineNameCheckbox;

    @FindBy (xpath = "//div[text()='2']")
    private WebElement pageNumberButton;

    public WorkoutPlansPage checkboxVerify() {
        routineNameCheckbox.isSelected();
        return this;
    }

    public WorkoutPlansPage clickOnPageNumberButton() {
        pageNumberButton.click();
        return this;
    }

    public WorkoutPlansPage openPage(String url) {
        driver.get(url);
        return this;
    }

}
