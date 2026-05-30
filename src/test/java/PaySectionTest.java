import Lesson9.SeleniumDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class PaySectionTest extends BaseTest {
    private WebDriver driver = SeleniumDriver.getInstance();

    @BeforeEach
    public void homePage() {
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @Test
    @DisplayName("Проверка названия секции")
    public void checkSectionTitle() {
        WebElement element = driver.findElement(By.xpath("//section[@class='pay']//h2"));
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", element.getText());
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    public void checkPaySystemsLogos() {
        ArrayList<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.xpath("//section[@class='pay']//div[@class='pay__partners']//li//img"));
        for (WebElement element : elements) {
            Assertions.assertTrue(element.isDisplayed());
        }
    }

    @Test
    @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
    public void checkAboutServiceLink() {
        WebElement element = driver.findElement(By.xpath("//section[@class='pay']//a"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlToBe("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Заполнение полей и проверка работы кнопки «Продолжить»")
    public void checkContinueButton() {
        WebElement phoneNumber = driver.findElement(By.xpath("//section[@class='pay']//form[@id='pay-connection']//input[@id='connection-phone']"));
        phoneNumber.sendKeys("297777777");
        WebElement sum = driver.findElement(By.xpath("//section[@class='pay']//form[@id='pay-connection']//input[@id='connection-sum']"));
        sum.sendKeys("150");
        WebElement continueButton = driver.findElement(By.xpath("//section[@class='pay']//form[@id='pay-connection']//button"));
        continueButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='payment-widget-iframe']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__text']//span")));
        WebElement element = driver.findElement(By.xpath("//div[@class='pay-description__text']//span"));
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777", element.getText());
    }
}
