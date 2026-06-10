package Lesson10.steps;

import Lesson10.pages.PaySectionPage;
import Lesson9.SeleniumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaySectionSteps {
    private final PaySectionPage paySectionPage;

    public PaySectionSteps() {
        paySectionPage = new PaySectionPage();
    }

    public PaySectionSteps acceptCookies() {
        if (!paySectionPage.getCookiesAcceptButton().isEmpty()) {
            paySectionPage.getCookiesAcceptButton().getFirst().click();
        }
        return this;
    }

    public PaySectionSteps checkTitle(String expectedTitle) {
        Assertions.assertEquals(expectedTitle, paySectionPage.getTitle().getText());
        return this;
    }

    public PaySectionSteps checkPaySystemsLogos() {
        for (WebElement element : paySectionPage.getPaySystemsLogos()) {
            Assertions.assertTrue(element.isDisplayed());
        }
        return this;
    }

    public PaySectionSteps clickAboutServiceLink() {
        paySectionPage.getAboutServiceLink().click();
        return this;
    }

    public PaySectionSteps waitUntilUrlToBe(String url) {
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getInstance(), 10);
        wait.until(ExpectedConditions.urlToBe(url));
        return this;
    }

    public PaySectionSteps checkUrl(String expectedUrl) {
        Assertions.assertEquals(expectedUrl, SeleniumDriver.getInstance().getCurrentUrl());
        return this;
    }

    public PaySectionSteps fillPhoneNumber(String phoneNumber) {
        paySectionPage.getPhoneNumberConnection().sendKeys(phoneNumber);
        return this;
    }

    public PaySectionSteps fillSum(String sum) {
        paySectionPage.getSumConnection().sendKeys(sum);
        return this;
    }

    public PaySectionSteps clickContinueButton() {
        paySectionPage.getContinueButton().click();
        return this;
    }

    public PaySectionSteps checkPhoneNumberConnectionPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getPhoneNumberConnection().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkSumConnectionPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getSumConnection().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkEmailConnectionPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getEmailConnection().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkPhoneNumberInternetPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getPhoneNumberInternet().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkSumInternetPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getSumInternet().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkEmailInternetPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getEmailInternet().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkScoreInstalmentPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getScoreInstalment().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkSumInstalmentPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getSumInstalment().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkEmailInstalmentPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getEmailInstalment().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkScoreArrearsPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getScoreArrears().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkSumArrearsPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getSumArrears().getAttribute("placeholder"));
        return this;
    }

    public PaySectionSteps checkEmailArrearsPlaceholder(String placeholder) {
        Assertions.assertEquals(placeholder, paySectionPage.getEmailArrears().getAttribute("placeholder"));
        return this;
    }

    public PaymentFrameSteps waitUntilFrameActive() {
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getInstance(), 10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='payment-widget-iframe']")));
        return new PaymentFrameSteps();
    }
}
