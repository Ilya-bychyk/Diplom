package org.diplom.test;

import org.diplom.entities.Entity;
import org.diplom.model.User;
import org.diplom.page.CoachPage;
import org.diplom.service.CoachPageService;
import org.diplom.service.LoginPageService;
import org.diplom.utils.Retry;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CoachPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private CoachPageService coachPageService;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
        coachPageService = new CoachPageService();
    }

    @Test(retryAnalyzer = Retry.class)
    public void FreeTrialTest() {
        if (!loginPageService.isLogged()) {
            User name = Entity.getUserValid();
            loginPageService.login(name.getName(), name.getPassword());
        }
        CoachPage coachPage = coachPageService.openCoachPage();
        new WebDriverWait(driver, Duration.ofMillis(20000L)).until(ExpectedConditions.urlContains("coach"));
        coachPage.clickOnFreeTrialButton();
        new WebDriverWait(driver, Duration.ofMillis(20000L)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit-btn']")));
        String actualCoachPageUrl = coachPage.getCurrentUrl();
        String expectedCoachPageUrl = "https://www.jefit.com/elite/checkout.php?";
        Assert.assertEquals(actualCoachPageUrl, expectedCoachPageUrl, "You didn't reach right page!");
    }
}
