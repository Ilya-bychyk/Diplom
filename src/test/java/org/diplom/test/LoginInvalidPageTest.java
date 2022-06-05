package org.diplom.test;


import org.diplom.page.MyJefitPage;
import org.diplom.service.LoginInvalidPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginInvalidPageTest extends BaseTest {

    private LoginInvalidPageService loginInvalidPageService;

    @BeforeClass
    public void setup() {
        loginInvalidPageService = new LoginInvalidPageService();
    }

    @Test
    public void InvalidLoginTest() {
        MyJefitPage myJefitPage = loginInvalidPageService.loginInvalid();
        String actualUrlPage = myJefitPage.getCurrentUrl();
        String expectedUrlPage = "https://www.jefit.com/login/?errmsg=1";
        Assert.assertEquals(actualUrlPage, expectedUrlPage, "The actual url of the page does not match expected!");
    }
}
