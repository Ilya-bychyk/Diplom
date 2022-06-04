package org.diplom.service;

import org.diplom.model.User;
import org.diplom.page.MyJefitPage;
import org.diplom.page.LoginPage;
public class LoginPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private LoginPage loginPage = new LoginPage();
    private User user = new User();

    public MyJefitPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(user.getName())
                .fillPassword(user.getPassword())
                .clickCheckbox()
                .clickLoginButton();
        return new MyJefitPage();

    }

}
