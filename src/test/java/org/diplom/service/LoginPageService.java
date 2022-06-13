package org.diplom.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.diplom.model.User;
import org.diplom.page.MyJefitPage;
import org.diplom.page.LoginPage;

@Log4j2
public class LoginPageService {
    private static final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private final LoginPage loginPage = new LoginPage();


    private boolean isLogged = false;

    @Step("Opening login page and fill all fields, after that click button login")
    public MyJefitPage login(String name, String password) {
        log.info("Fill in all fields on the Login Page");
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(name)
                .fillPassword(password)
                .clickCheckbox()
                .clickLoginButton();
        isLogged = true;
        return new MyJefitPage();
    }

    public boolean isLogged() {
        return isLogged;
    }

}
