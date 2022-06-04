package org.diplom.test;

import org.diplom.page.MyJefitPage;
import org.diplom.page.WorkoutPlansPage;
import org.diplom.service.LoginPageService;
import org.diplom.service.WorkoutPlansPageService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkoutPlansPageTest extends BaseTest {

   private LoginPageService loginPageService;
   private WorkoutPlansPage workoutPlansPage;
   private WorkoutPlansPageService workoutPlansPageService;

    public WorkoutPlansPageTest(WorkoutPlansPage workoutPlansPage) {
        this.workoutPlansPage = workoutPlansPage;
    }

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
        workoutPlansPage = new WorkoutPlansPage();
        workoutPlansPageService = new WorkoutPlansPageService();
    }

    @Test
        public void RoutineNameCheckboxTest() {
        MyJefitPage myJefitPage = loginPageService.login();
        WorkoutPlansPageService workoutPlansPageOpen =  workoutPlansPageService.openWorkoutPage();
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("routines"));
        WorkoutPlansPage checkbox = workoutPlansPage.checkboxVerify();
        Assert.assertEquals(checkbox, true, "Checkbox is not selected!");
    }

}
