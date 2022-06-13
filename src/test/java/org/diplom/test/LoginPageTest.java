package org.diplom.test;

import org.diplom.entities.Entity;
import org.diplom.model.User;
import org.diplom.page.MyJefitPage;
import org.diplom.service.LoginInvalidPageService;
import org.diplom.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private LoginInvalidPageService loginInvalidPageService;

    @BeforeClass
    public void setup() {
        loginPageService = new LoginPageService();
        loginInvalidPageService = new LoginInvalidPageService();
    }


    @Test
    public void LoginTest() {
        User name = Entity.getUserValid();
        MyJefitPage myJefitPage = loginPageService.login(name.getName(), name.getPassword());
        String actualUrlPage = myJefitPage.getCurrentUrl();
        String expectedUrlPage = "https://www.jefit.com/my-jefit/";
        Assert.assertEquals(actualUrlPage, expectedUrlPage, "The actual url of the page does not match expected!");
    }

    @Test
    public void LoginInvalidTest() {
        MyJefitPage myJefitPage = loginInvalidPageService.loginInvalid();
        String actualUrlPage = myJefitPage.getCurrentUrl();
        String expectedUrlPage = "https://www.jefit.com/login/?errmsg=1";
        Assert.assertEquals(actualUrlPage, expectedUrlPage, "The actual url of the page does not match expected!");
    }
}
