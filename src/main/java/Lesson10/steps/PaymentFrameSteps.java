package Lesson10.steps;

import Lesson10.pages.PaymentFramePage;
import Lesson9.SeleniumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentFrameSteps {
    private final PaymentFramePage paymentFramePage;

    public PaymentFrameSteps() {
        paymentFramePage = new PaymentFramePage();
    }

    public PaymentFrameSteps waitUntilFrameShown() {
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getInstance(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__text']//span")));
        return this;
    }

    public PaymentFrameSteps checkDescription(String expectedDescription) {
        Assertions.assertEquals(expectedDescription, paymentFramePage.getDescription().getText());
        return this;
    }

    public PaymentFrameSteps checkCost(String expected) {
        Assertions.assertEquals(expected, paymentFramePage.getCost().getText());
        return this;
    }

    public PaymentFrameSteps checkPayButtonText(String expected) {
        Assertions.assertEquals(expected, paymentFramePage.getPayButtonText().getText());
        return this;
    }

    public PaymentFrameSteps checkCardNumberLabel(String expected) {
        Assertions.assertEquals(expected, paymentFramePage.getCardNumberLabel().getText());
        return this;
    }

    public PaymentFrameSteps checkCardExpiresLabel(String expected) {
        Assertions.assertEquals(expected, paymentFramePage.getCardExpiresLabel().getText());
        return this;
    }

    public PaymentFrameSteps checkCardCVCLabel(String expected) {
        Assertions.assertEquals(expected, paymentFramePage.getCardCVCLabel().getText());
        return this;
    }

    public PaymentFrameSteps checkCardHolderLabel(String expected) {
        Assertions.assertEquals(expected, paymentFramePage.getCardHolderLabel().getText());
        return this;
    }

    public PaymentFrameSteps checkPaySystemsLogos() {
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getInstance(), 10);
        for (WebElement element : paymentFramePage.getPaySystemsLogos()) {
            if (!element.isDisplayed()) {
                wait.until(ExpectedConditions.visibilityOf(element));
            }
            Assertions.assertTrue(element.isDisplayed());
        }
        return this;
    }
}
