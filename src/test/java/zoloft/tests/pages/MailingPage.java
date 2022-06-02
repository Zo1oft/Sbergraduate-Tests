package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MailingPage {
    //locator
    SelenideElement
            mailingFormHeader = $("#digest-form");

    //action

    public void mailingPageCheck() {
        mailingFormHeader.shouldHave(Condition.text("Подпишись на рассылку"));

    }
}
