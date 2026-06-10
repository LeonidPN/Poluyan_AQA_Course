package Lesson10.pages;

import Lesson9.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentFramePage {
    private final WebDriver driver;
    private final By description = By.xpath("//div[@class='pay-description__text']//span");
    private final By cost = By.xpath("//div[@class='pay-description__cost']//span");
    private final By payButtonText = By.xpath("//div[@class='card-page__card']//button//span");
    private final By cardNumberLabel = By.xpath("//div[@class='card-page__card']//form//div[@class='content ng-tns-c2312288139-2']//label");
    private final By cardExpiresLabel = By.xpath("//div[@class='card-page__card']//form//div[@class='expires-input ng-tns-c2797898136-1 ng-star-inserted']//label");
    private final By cardCVCLabel = By.xpath("//div[@class='card-page__card']//form//div[@class='cvc-input ng-tns-c2797898136-1 ng-star-inserted']//label");
    private final By cardHolderLabel = By.xpath("//div[@class='card-page__card']//form//div[@class='app-input ng-tns-c2312288139-3']//label");
    private final By paySystemsLogos = By.xpath("//div[@class='card-page__card']//form//div[@class='cards-brands ng-tns-c2312288139-2']//img");

    public PaymentFramePage() {
        driver = SeleniumDriver.getInstance();
    }

    public WebElement getDescription() {
        return driver.findElement(description);
    }

    public WebElement getCost() {
        return driver.findElement(cost);
    }

    public WebElement getPayButtonText() {
        return driver.findElement(payButtonText);
    }

    public WebElement getCardNumberLabel() {
        return driver.findElement(cardNumberLabel);
    }

    public WebElement getCardExpiresLabel() {
        return driver.findElement(cardExpiresLabel);
    }

    public WebElement getCardCVCLabel() {
        return driver.findElement(cardCVCLabel);
    }

    public WebElement getCardHolderLabel() {
        return driver.findElement(cardHolderLabel);
    }

    public List<WebElement> getPaySystemsLogos() {
        return driver.findElements(paySystemsLogos);
    }
}
