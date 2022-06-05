package org.diplom.service;

import org.diplom.model.UserInvalid;
import org.diplom.page.LoginPage;
import org.diplom.page.MyJefitPage;

public class LoginInvalidPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private final LoginPage loginPage = new LoginPage();

    public MyJefitPage loginInvalid() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(UserInvalid.name)
                .fillPassword(UserInvalid.password)
                .clickCheckbox()
                .clickLoginButton();
        return new MyJefitPage();

    }
}
