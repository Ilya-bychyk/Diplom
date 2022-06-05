package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyJefitPage extends BasePage {

    @FindBy(xpath = "//a[contains( text(),'My Routines')]")
    private WebElement MyRoutineButton;

    @FindBy(xpath = "//a[contains( text(),'My Logs')]")
    private WebElement MyLogsButton;

    @FindBy(xpath = "//a[contains( text(),'Workout Plans')]")
    private WebElement WorkoutPlansButton;

    @FindBy(xpath = "//a[contains( text(),'Coach')]")
    private WebElement CoachButton;

    @FindBy(xpath = "//a[contains( text(),'Exercise Guide')]")
    private WebElement ExerciseGuideButton;

    @FindBy(xpath = "//a[contains( text(),'Elite')]")
    private WebElement EliteButton;

    public MyJefitPage clickOnExerciseGuideButton() {
        ExerciseGuideButton.click();
        return this;
    }

    public MyJefitPage clickOnEliteButton() {
        EliteButton.click();
        return this;
    }

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

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
