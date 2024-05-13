package com.vytrack.step_definitions;

import com.vytrack.pages.US008_Calendar_Event_Page_PM;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;

public class US008_Calendar_Events_Step_Def_PM {

    US008_Calendar_Event_Page_PM us008CalendarEventPagePm = new US008_Calendar_Event_Page_PM();

    @When("User is on Vytrack home page and hoverover  to activities")
    public void user_is_on_vytrack_home_page_and_hoverover_to_activities() {
        BrowserUtils.hover(us008CalendarEventPagePm.activitiesButton);



    }
    @When("User click on  calendar events")
    public void user_click_on_calendar_events() {
        BrowserUtils.waitForClickablility(us008CalendarEventPagePm.calendarEventsBtn,2);

        us008CalendarEventPagePm.calendarEventsBtn.click();

    }
    @When("User click on  create calendar event")
    public void user_click_on_create_calendar_event() {

        us008CalendarEventPagePm.createCalendarEvent.click();


    }
    @When("user click on the Repeat check box")
    public void user_click_on_the_repeat_check_box() {

        us008CalendarEventPagePm.repeatBtn.click();


    }
    @Then("User sees number {string} in repeat check box")
    public void user_sees_number_in_repeat_check_box(String expected) {

        // String actual = us008_calendar_event_page.repeatEveryBox.getText();

        String value = us008CalendarEventPagePm.repeatEveryBox.getAttribute("value");

        System.out.println(value);

        Assert.assertEquals(value, expected);

        //us008_calendar_event_page.repeatEveryBox.getAttribute(1)

    }

    @And("user click inside repeat every and delete number {int}")
    public void userClickInsideRepeatEveryAndDeleteNumber(int number) {

        us008CalendarEventPagePm.repeatEveryBox.clear();



        
    }

    @Then("user sees the error message This value should not be blank")
    public void userSeesTheErrorMessageThisValueShouldNotBeBlank() {

          BrowserUtils.verifyElementDisplayed(us008CalendarEventPagePm.errorMessage);
    }
}
