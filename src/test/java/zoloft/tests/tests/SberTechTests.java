package zoloft.tests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zoloft.tests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class SberTechTests extends TestBase {

    @Test
    @Description("Проверка работы страницы Рассылки")
    @DisplayName("Рассылка")
    void mailPageTest() {
        step("Открываем сайт Sbergraduate", () -> {
           mainPage.openPage();
        });

        step("Нажимаем на кнопку 'Рассылка'", () -> {
            mainPage.mailPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            mailingPage.mailingPageCheck();
        });
    }

    @Test
    @Description("Проверка работы станицы 'События'")
    @DisplayName("Покупателю")
    void eventsPageTest() {
        step("Открываем сайт Sbergraduate", () -> {
            mainPage.openPage();
        });

        step("Переходим на страницу 'События'", () -> {
            mainPage.confirmCookies();
            mainPage.eventsPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            eventsPage.eventsPageCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт Sbergraduate", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "SberGraduate - Твори будущее со Сбером";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт Sbergraduate", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}