import Lesson10.steps.PaySectionSteps;
import Lesson9.SeleniumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class PaySectionTest extends BaseTest {
    private final WebDriver driver = SeleniumDriver.getInstance();
    private PaySectionSteps paySectionSteps;

    @BeforeEach
    public void homePage() {
        driver.get("https://www.mts.by/");
        paySectionSteps = new PaySectionSteps();
        paySectionSteps.acceptCookies();
    }

    @Test
    @DisplayName("Проверка названия секции")
    public void checkSectionTitle() {
        paySectionSteps.checkTitle("Онлайн пополнение\nбез комиссии");
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    public void checkPaySystemsLogos() {
        paySectionSteps.checkPaySystemsLogos();
    }

    @Test
    @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
    public void checkAboutServiceLink() {
        String url = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        paySectionSteps.clickAboutServiceLink()
                .waitUntilUrlToBe(url)
                .checkUrl(url);
    }

    @Test
    @DisplayName("Заполнение полей и проверка работы кнопки «Продолжить»")
    public void checkContinueButton() {
        paySectionSteps.fillPhoneNumber("297777777")
                .fillSum("150")
                .clickContinueButton()
                .waitUntilFrameActive()
                .waitUntilFrameShown()
                .checkDescription("Оплата: Услуги связи Номер:375297777777");
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для варианта \"Услуги связи\"")
    public void checkPayConnectionPlaceholders() {
        paySectionSteps.checkPhoneNumberConnectionPlaceholder("Номер телефона")
                .checkSumConnectionPlaceholder("Сумма")
                .checkEmailConnectionPlaceholder("E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для варианта \"Домашний интернет\"")
    public void checkPayInternetPlaceholders() {
        paySectionSteps.checkPhoneNumberInternetPlaceholder("Номер абонента")
                .checkSumInternetPlaceholder("Сумма")
                .checkEmailInternetPlaceholder("E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для варианта \"Рассрочка\"")
    public void checkPayInstalmentPlaceholders() {
        paySectionSteps.checkScoreInstalmentPlaceholder("Номер счета на 44")
                .checkSumInstalmentPlaceholder("Сумма")
                .checkEmailInstalmentPlaceholder("E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для варианта \"Задолженность\"")
    public void checkPayArrearsPlaceholders() {
        paySectionSteps.checkScoreArrearsPlaceholder("Номер счета на 2073")
                .checkSumArrearsPlaceholder("Сумма")
                .checkEmailArrearsPlaceholder("E-mail для отправки чека");
    }

    @Test
    @DisplayName("Заполнение полей и проверка текстов в окне оплаты")
    public void checkPaymentFrameTexts() {
        paySectionSteps.fillPhoneNumber("297777777")
                .fillSum("150")
                .clickContinueButton()
                .waitUntilFrameActive()
                .waitUntilFrameShown()
                .checkCost("150.00 BYN")
                .checkPayButtonText("Оплатить 150.00 BYN")
                .checkDescription("Оплата: Услуги связи Номер:375297777777")
                .checkCardNumberLabel("Номер карты")
                .checkCardExpiresLabel("Срок действия")
                .checkCardCVCLabel("CVC")
                .checkCardHolderLabel("Имя и фамилия на карте")
                .checkPaySystemsLogos();
    }
}
