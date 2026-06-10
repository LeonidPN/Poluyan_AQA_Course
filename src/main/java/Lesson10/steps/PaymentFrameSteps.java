package Lesson10.steps;

import Lesson10.pages.PaymentFramePage;
import Lesson9.SeleniumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentFrameSteps {
    private final PaymentFramePage paymentFramePage;

    public PaymentFrameSteps() {
        paymentFramePage = new PaymentFramePage();
    }

    public PaymentFrameSteps waitUntilDescriptionShown() {
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getInstance(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__text']//span")));
        return this;
    }

    public void checkDescription(String expectedDescription) {
        Assertions.assertEquals(expectedDescription, paymentFramePage.getDescription().getText());
    }
}
