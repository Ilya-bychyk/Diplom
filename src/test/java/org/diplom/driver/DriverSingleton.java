package org.diplom.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton() {
    }
    public static WebDriver getDriver() {
        if (null == driver) {
            switch (System.getProperty("browser", "chrome")) {
                case "firefox": {
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                }
                default: {
                    WebDriverManager.chromiumdriver().setup();
                    driver = new ChromeDriver();
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
