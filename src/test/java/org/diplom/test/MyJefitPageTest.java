package org.diplom.test;

import org.diplom.entities.Entity;
import org.diplom.model.User;
import org.diplom.page.MyJefitPage;
import org.diplom.service.LoginPageService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyJefitPageTest extends BaseTest {
    private LoginPageService loginPageService;
    private MyJefitPage myJefitPage;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
    }

    @Test (priority = 2)
    public void WorkoutPlansTest() {
        myJefitPage.clickWorkoutPlansButton().clickWorkoutPlansButton();
        String actualUrlOfWorkoutPlans = myJefitPage.getCurrentUrl();
        String expectedUrlOfWorkoutPlans = "https://www.jefit.com/routines/";
        Assert.assertEquals(actualUrlOfWorkoutPlans, expectedUrlOfWorkoutPlans);

    }

    @Test (priority = 3)
    public void MyRoutinesTest() {
        myJefitPage.clickMyRoutineButton();
        String actualUrlOfMyRoutines = myJefitPage.getCurrentUrl();
        String expectedUrlOfMyRoutines = "https://www.jefit.com/my-jefit/my-routines/routine-manager.php";
        Assert.assertEquals(actualUrlOfMyRoutines, expectedUrlOfMyRoutines, "You didn't get the right page");

    }

    @Test (priority = 1)
        public void MyLogsTest() {
        User name = Entity.getUserValid();
        myJefitPage = loginPageService.login(name.getName(), name.getPassword());
        myJefitPage.clickMyLogsButton();
        String actualUrlOfMyLogs = myJefitPage.getCurrentUrl();
        String expectedUrlOfMyLogs = "https://www.jefit.com/my-jefit/my-logs/";
        Assert.assertEquals(actualUrlOfMyLogs, expectedUrlOfMyLogs, "You didn't get the right page");

    }

    @Test (priority = 4)
    public void ExerciseGuideButtonTest() {
        myJefitPage.clickOnExerciseGuideButton();
        String actualUrlOfExercise = myJefitPage.getCurrentUrl();
        String expectedUrlOfExercise = "https://www.jefit.com/exercises/";
        Assert.assertEquals(actualUrlOfExercise, expectedUrlOfExercise, "You didn't get the right page");
    }

    @Test (priority = 5)
    public void EliteButtonTest() {
        myJefitPage.clickOnEliteButton();
        String actualUrlOfElite = myJefitPage.getCurrentUrl();
        String expectedUrlOfElite = "https://www.jefit.com/elite/";
        Assert.assertEquals(actualUrlOfElite, expectedUrlOfElite, "You didn't get the right page");
    }

}
