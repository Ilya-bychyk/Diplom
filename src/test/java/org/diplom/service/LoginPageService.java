package org.diplom.service;

import org.diplom.model.User;
import org.diplom.page.MyJefitPage;
import org.diplom.page.LoginPage;
public class LoginPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private final LoginPage loginPage = new LoginPage();

    public MyJefitPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(User.name)
                .fillPassword(User.password)
                .clickCheckbox()
                .clickLoginButton();
        return new MyJefitPage();

    }

}
