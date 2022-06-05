package org.diplom.test;

import org.diplom.page.WorkoutPlansPage;
import org.diplom.service.LoginPageService;
import org.diplom.service.WorkoutPlansPageService;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkoutPlansPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private WorkoutPlansPageService workoutPlansPageService;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
        workoutPlansPageService = new WorkoutPlansPageService();
    }

    @Test(priority = 1)
    public void RoutineNameCheckboxTest() {
        loginPageService.login();
        WorkoutPlansPage workoutPlansPage = workoutPlansPageService.openWorkoutPage();
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("routines"));
        boolean isCheckboxSelected = workoutPlansPage.checkboxVerify();
        Assert.assertTrue(isCheckboxSelected, "Checkbox is not selected!");
    }

    @Test(priority = 2)
    public void BlogPageButtonTest() {
        WorkoutPlansPage workoutPlansPage = workoutPlansPageService.openWorkoutPage();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Create A Plan')]")));
        workoutPlansPage.clickOnPageNumberButton();
        String actualSecondPageUrl = workoutPlansPage.getCurrentUrl();
        String expectedSecondPageUrl = "https://www.jefit.com/blog";
        Assert.assertEquals(actualSecondPageUrl, expectedSecondPageUrl, "You didn't reach right page!");
    }

}
