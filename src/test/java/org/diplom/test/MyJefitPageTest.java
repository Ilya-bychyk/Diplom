package org.diplom.test;

import org.diplom.page.BasePage;
import org.diplom.page.MyJefitPage;
import org.diplom.service.LoginPageService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyJefitPageTest extends BaseTest {
    private LoginPageService loginPageService;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void WorkoutPlansTest() {
        MyJefitPage myJefitPage = loginPageService.login();
        MyJefitPage workoutPlans = myJefitPage.clickWorkoutPlansButton().clickWorkoutPlansButton();
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("routines"));
        String actualUrlOfWorkoutPlans = myJefitPage.getCurrentUrl();
        String expectedUrlOfWorkoutPlans = "https://www.jefit.com/routines/";
        Assert.assertEquals(actualUrlOfWorkoutPlans, expectedUrlOfWorkoutPlans);
    }

    @Test
    public void MyRoutinesTest() {
        MyJefitPage myJefitPage = loginPageService.login();
        MyJefitPage myRoutines = myJefitPage.clickMyRoutineButton();
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("routine-manager"));
        String actualUrlOfMyRoutines = myJefitPage.getCurrentUrl();
        String expectedUrlOfMyRoutines = "https://www.jefit.com/my-jefit/my-routines/routine-manager.php";
        Assert.assertEquals(actualUrlOfMyRoutines, expectedUrlOfMyRoutines, "You didn't get the right page");
    }

    @Test
    public void MyLogsTest() {
        MyJefitPage myJefitPage = loginPageService.login();
        MyJefitPage myRoutines = myJefitPage.clickMyLogsButton();
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("my-logs"));
        String actualUrlOfMyLogs = myJefitPage.getCurrentUrl();
        String expectedUrlOfMyLogs = "https://www.jefit.com/my-jefit/my-logs/";
        Assert.assertEquals(actualUrlOfMyLogs, expectedUrlOfMyLogs, "You didn't get the right page");
    }

}
