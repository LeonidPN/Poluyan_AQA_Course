package Lesson9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class SeleniumDriver {
    private final static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static ChromeOptions options;

    public static WebDriver getInstance() {
        if (Objects.isNull(driver.get())) {
            driver.set(new ChromeDriver(options));
        }
        return driver.get();
    }

    public static void setOptions(ChromeOptions options) {
        SeleniumDriver.options = options;
    }
}
