package org.diplom.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.diplom.entities.Entity;
import org.diplom.model.User;
import org.diplom.page.LoginPage;
import org.diplom.page.MyJefitPage;

@Log4j2
public class LoginInvalidPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private final LoginPage loginPage = new LoginPage();

    @Step("Fill in all fields on the Login Page")
    public MyJefitPage loginInvalid() {
        User userInvalid = Entity.getUserInvalid();
        log.info("Fill in all fields on the Login Page");
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(userInvalid.getName())
                .fillPassword(userInvalid.getPassword())
                .clickCheckbox()
                .clickLoginButton();
        return new MyJefitPage();

    }
}
