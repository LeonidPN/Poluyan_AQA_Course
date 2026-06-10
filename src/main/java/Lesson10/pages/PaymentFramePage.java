package Lesson10.pages;

import Lesson9.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentFramePage {
    private final WebDriver driver;
    private final By description = By.xpath("//div[@class='pay-description__text']//span");

    public PaymentFramePage() {
        driver = SeleniumDriver.getInstance();
    }

    public WebElement getDescription() {
        return driver.findElement(description);
    }
}
