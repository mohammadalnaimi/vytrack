package com.vytrack.step_definitions;

import com.vytrack.pages.US008_Calendar_Event_Page_PM;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US009_RepeatEvery_StepDef_AR {

    US008_Calendar_Event_Page_PM us008CalendarEventPagePm = new US008_Calendar_Event_Page_PM();

    @When("User is on Vytrack home page and hover over to activities")
    public void user_is_on_vytrack_home_page_and_hover_over_to_activities() {

        BrowserUtils.hover(us008CalendarEventPagePm.activitiesButton);
    }

    @When("User clicks on calendar events")
    public void user_clicks_on_calendar_events() {

        BrowserUtils.waitForClickablility(us008CalendarEventPagePm.calendarEventsBtn,5);

        us008CalendarEventPagePm.calendarEventsBtn.click();
    }

    @When("User clicks on create calendar event")
    public void user_clicks_on_create_calendar_event() {

       // BrowserUtils.waitForPageToLoad(5);
       // BrowserUtils.waitForClickablility(us008CalendarEventPagePm.createCalendarEvent,10);
        BrowserUtils.clickWithWait(By.xpath("//a[@title='Create Calendar event']"), 4);
    }

    @When("User clicks on the Repeat check box")
    public void user_clicks_on_the_repeat_check_box() {

        BrowserUtils.clickWithWait(By.xpath("//input[@data-name='recurrence-repeat']"), 4);
    }

    @When("User enters {string} in Repeat Every input box")
    public void user_enters_in_repeat_every_input_box(String invalidInt) {

        us008CalendarEventPagePm.repeatEveryBox.clear();

       us008CalendarEventPagePm.repeatEveryBox0.sendKeys(invalidInt);

    }



    @Then("User sees the error message for {string}")
    public void userSeesTheErrorMessageFor(String value) {

        String actualErrorMsg = us008CalendarEventPagePm.invalidValue.getText();

        String expectedErrorMsg = "The value have not to be less than 1.";

        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
    }

    @Then("User sees the error message {string}")
    public void userSeesTheErrorMessage(String value) {

        String actualErrorMsg = us008CalendarEventPagePm.invalidValue.getText();

        String expectedErrorMsg2 = "The value have not to be more than 99.";

        Assert.assertEquals(actualErrorMsg, expectedErrorMsg2);
    }
}
