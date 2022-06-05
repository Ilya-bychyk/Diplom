package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkoutPlansPage extends BasePage {

    @FindBy(xpath = "//tbody/tr[1]/td[4]/input[1]")
    private WebElement routineNameCheckbox;

    @FindBy (xpath = "//a[contains(text(), 'Blog')]")
    private WebElement blogButton;

    public boolean checkboxVerify() {
        return routineNameCheckbox.isSelected();
    }

    public WorkoutPlansPage clickOnPageNumberButton() {
        blogButton.click();
        return this;
    }

    public WorkoutPlansPage openPage(String url) {
        driver.get(url);
        return this;
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
