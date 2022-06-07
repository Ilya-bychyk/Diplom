package org.diplom.service;

import lombok.extern.log4j.Log4j2;
import org.diplom.model.UserInvalid;
import org.diplom.page.LoginPage;
import org.diplom.page.MyJefitPage;

@Log4j2
public class LoginInvalidPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private final LoginPage loginPage = new LoginPage();

    public MyJefitPage loginInvalid() {
        log.info("Fill in all fields on the Login Page");
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(UserInvalid.name)
                .fillPassword(UserInvalid.password)
                .clickCheckbox()
                .clickLoginButton();
        return new MyJefitPage();

    }
}
