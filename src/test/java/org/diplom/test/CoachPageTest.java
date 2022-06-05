package org.diplom.test;

import org.diplom.page.CoachPage;
import org.diplom.service.CoachPageService;
import org.diplom.service.LoginPageService;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CoachPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private CoachPageService coachPageService;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
        coachPageService = new CoachPageService();
    }

    @Test
    public void FreeTrialTest() {
        loginPageService.login();
        CoachPage coachPage = coachPageService.openCoachPage();
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("coach"));
        coachPage.clickOnFreeTrialButton();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit-btn']")));
        String actualCoachPageUrl = coachPage.getCurrentUrl();
        String expectedCoachPageUrl = "https://www.jefit.com/elite/checkout.php?coach";
        Assert.assertEquals(actualCoachPageUrl, expectedCoachPageUrl, "You didn't reach right page!");
    }
}
