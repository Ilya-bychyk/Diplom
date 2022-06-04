package org.diplom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardPage extends BasePage {
    @FindBy (xpath = "//div[@id='example2-card-number']")
    private WebElement cardNumber;

    @FindBy (xpath = "//div[@id='example2-card-expiry']")
    private WebElement expiration;

    @FindBy (xpath = "//div[@id='example2-card-cvc']")
    private WebElement cvc;

    @FindBy (xpath = "//div[@id='example2-card-address']")
    private WebElement address;

    @FindBy (xpath = "//div[@id='example2-card-city']")
    private WebElement city;

    @FindBy (xpath = "//div[@id='example2-card-state']")
    private WebElement state;

    @FindBy (xpath = "//div[@id='example2-card-zip']")
    private WebElement zip;

    public CardPage openCardPage(String url) {
        driver.get(url);
        return this;
    }
    public CardPage fillCardNumber(String Number) {
        cardNumber.clear();
        cardNumber.sendKeys(Number);
        return this;
    }
}
