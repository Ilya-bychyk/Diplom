package org.diplom.page;

import org.diplom.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}