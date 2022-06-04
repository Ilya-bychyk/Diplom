package org.diplom.service;

import org.diplom.model.UserInvalid;
import org.diplom.page.LoginPage;
import org.diplom.page.MyJefitPage;

public class LoginInvalidPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private LoginPage loginPage = new LoginPage();
    private UserInvalid userInvalid = new UserInvalid();

    public MyJefitPage loginInvalid() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(userInvalid.getName())
                .fillPassword(userInvalid.getPassword())
                .clickCheckbox()
                .clickLoginButton();
        return new MyJefitPage();

    }
}
