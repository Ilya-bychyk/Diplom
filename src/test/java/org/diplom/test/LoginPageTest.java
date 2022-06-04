package org.diplom.test;

import org.diplom.page.MyJefitPage;
import org.diplom.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void LoginTest() {
        MyJefitPage myJefitPage = loginPageService.login();
        String actualUrlPage = myJefitPage.getCurrentUrl();
        String expectedUrlPage = "https://www.jefit.com/my-jefit/";
        Assert.assertEquals(actualUrlPage, expectedUrlPage, "The actual url of the page does not match expected!");
    }

}
