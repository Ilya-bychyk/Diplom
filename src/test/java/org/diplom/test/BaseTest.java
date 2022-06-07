package org.diplom.test;

import org.diplom.driver.DriverSingleton;
import org.diplom.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
