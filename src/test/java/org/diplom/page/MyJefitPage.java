package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyJefitPage extends BasePage {

    @FindBy(xpath = "//a[contains( text(),'My Routines')]")
    private WebElement MyRoutineButton;

    @FindBy (xpath = "//a[contains( text(),'My Logs')]")
    private WebElement MyLogsButton;

    @FindBy (xpath = "//a[contains( text(),'Workout Plans')]")
    private WebElement WorkoutPlansButton;

    @FindBy (xpath = "//a[contains( text(),'Coach')]")
    private WebElement CoachButton;


    public MyJefitPage clickMyRoutineButton() {
        MyRoutineButton.click();
        return this;
    }
    public MyJefitPage clickMyLogsButton() {
        MyLogsButton.click();
        return this;
    }
    public MyJefitPage clickWorkoutPlansButton() {
        WorkoutPlansButton.click();
        return this;
    }
    public MyJefitPage clickCoachButton() {
        CoachButton.click();
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
