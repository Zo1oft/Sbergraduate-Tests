package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            mailingListButton = $$(".btn--color-1").findBy(Condition.text("Рассылка")),
            cookieConfirmButton = $("#cookie-confirm"),
            eventsPageButton = $$(".btn--color-1").findBy(Condition.text("Смотреть все события"));

    //actions
    public MainPage openPage() {
        open("https://sbergraduate.ru/");
        return this;
    }

    public void mailPageTransfer() {
        mailingListButton.click();

    }

    public void confirmCookies() {
       cookieConfirmButton.click();
    }

    public void eventsPageTransfer() {
       eventsPageButton.click();
    }
}
