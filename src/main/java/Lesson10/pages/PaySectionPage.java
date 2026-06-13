package Lesson10.pages;

import Lesson9.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaySectionPage {
    private final WebDriver driver;
    private final By cookiesAcceptButton = By.id("cookie-agree");
    private final By title = By.xpath("//section[@class='pay']//h2");
    private final By paySystemsLogos = By.xpath("//section[@class='pay']//div[@class='pay__partners']//li//img");
    private final By aboutServiceLink = By.xpath("//section[@class='pay']//a");
    private final By phoneNumberConnection = By.xpath("//section[@class='pay']//form[@id='pay-connection']//input[@id='connection-phone']");
    private final By sumConnection = By.xpath("//section[@class='pay']//form[@id='pay-connection']//input[@id='connection-sum']");
    private final By emailConnection = By.xpath("//section[@class='pay']//form[@id='pay-connection']//input[@id='connection-email']");
    private final By phoneNumberInternet = By.xpath("//section[@class='pay']//form[@id='pay-internet']//input[@id='internet-phone']");
    private final By sumInternet = By.xpath("//section[@class='pay']//form[@id='pay-internet']//input[@id='internet-sum']");
    private final By emailInternet = By.xpath("//section[@class='pay']//form[@id='pay-internet']//input[@id='internet-email']");
    private final By scoreInstalment = By.xpath("//section[@class='pay']//form[@id='pay-instalment']//input[@id='score-instalment']");
    private final By sumInstalment = By.xpath("//section[@class='pay']//form[@id='pay-instalment']//input[@id='instalment-sum']");
    private final By emailInstalment = By.xpath("//section[@class='pay']//form[@id='pay-instalment']//input[@id='instalment-email']");
    private final By scoreArrears = By.xpath("//section[@class='pay']//form[@id='pay-arrears']//input[@id='score-arrears']");
    private final By sumArrears = By.xpath("//section[@class='pay']//form[@id='pay-arrears']//input[@id='arrears-sum']");
    private final By emailArrears = By.xpath("//section[@class='pay']//form[@id='pay-arrears']//input[@id='arrears-email']");
    private final By continueButton = By.xpath("//section[@class='pay']//form[@id='pay-connection']//button");

    public PaySectionPage() {
        driver = SeleniumDriver.getInstance();
    }

    public List<WebElement> getCookiesAcceptButton() {
        return driver.findElements(cookiesAcceptButton);
    }

    public WebElement getTitle() {
        return driver.findElement(title);
    }

    public List<WebElement> getPaySystemsLogos() {
        return driver.findElements(paySystemsLogos);
    }

    public WebElement getAboutServiceLink() {
        return driver.findElement(aboutServiceLink);
    }

    public WebElement getPhoneNumberConnection() {
        return driver.findElement(phoneNumberConnection);
    }

    public WebElement getSumConnection() {
        return driver.findElement(sumConnection);
    }

    public WebElement getEmailConnection() {
        return driver.findElement(emailConnection);
    }

    public WebElement getPhoneNumberInternet() {
        return driver.findElement(phoneNumberInternet);
    }

    public WebElement getSumInternet() {
        return driver.findElement(sumInternet);
    }

    public WebElement getEmailInternet() {
        return driver.findElement(emailInternet);
    }

    public WebElement getScoreInstalment() {
        return driver.findElement(scoreInstalment);
    }

    public WebElement getSumInstalment() {
        return driver.findElement(sumInstalment);
    }

    public WebElement getEmailInstalment() {
        return driver.findElement(emailInstalment);
    }

    public WebElement getScoreArrears() {
        return driver.findElement(scoreArrears);
    }

    public WebElement getSumArrears() {
        return driver.findElement(sumArrears);
    }

    public WebElement getEmailArrears() {
        return driver.findElement(emailArrears);
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }
}
