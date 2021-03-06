package org.diplom.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
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
        log.info("Click on button Exercise Guide");
        ExerciseGuideButton.click();
        return this;
    }

    public MyJefitPage clickOnEliteButton() {
        log.info("Click on button Elite");
        EliteButton.click();
        return this;
    }

    public MyJefitPage clickMyRoutineButton() {
        log.info("Click on button My Routine");
        MyRoutineButton.click();
        return this;
    }

    public MyJefitPage clickMyLogsButton() {
        log.info("Click on button My Logs");
        MyLogsButton.click();
        return this;
    }

    public MyJefitPage clickWorkoutPlansButton() {
        log.info("Click on button Workout Plans");
        WorkoutPlansButton.click();
        return this;
    }

    public String getCurrentUrl() {
        log.info("Getting url of current page");
        return driver.getCurrentUrl();
    }

}
