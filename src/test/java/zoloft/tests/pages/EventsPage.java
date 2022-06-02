package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EventsPage {
    //locators
    SelenideElement
    eventsTitle = $("#site__title");


    //actions

    public void eventsPageCheck() {
        eventsTitle.shouldHave(Condition.text("События"));
    }
}
