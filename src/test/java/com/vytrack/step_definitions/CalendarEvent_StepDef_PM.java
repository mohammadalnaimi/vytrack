package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEvent_Page_PM;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class CalendarEvent_StepDef_PM {

    CalendarEvent_Page_PM calendarEventPagePm = new CalendarEvent_Page_PM();

    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is logged in on homepage")
    public void the_user_is_logged_in_on_homepage() {


        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Then("the user hovers over {string}")
    public void the_user_hovers_over(String string) {


        actions.moveToElement(calendarEventPagePm.activitiesButton).perform();


    }
    @Then("the user clicks {string}")
    public void the_user_clicks(String string) {

        actions.moveToElement(calendarEventPagePm.calendarEventsButton).perform();

    }
    @Then("the user click {string}")
    public void the_user_click(String string) {

        calendarEventPagePm.createCalendarEventButton.click();
    }
    @Then("the user clicks {string} checkbox")
    public void the_user_clicks_checkbox(String string) {

        calendarEventPagePm.repeatButton.click();

    }
    @Then("the user clicks {string} radio button")
    public void the_user_clicks_radio_button(String string) {

        calendarEventPagePm.repeatEveryButton.click();

    }
    @Then("the user sees the number 1 by default in {string} input option")
    public void the_user_sees_the_number_by_default_in_input_option(String string) {

        calendarEventPagePm.repeatEveryNumber.click();

    }
    @Then("the user deletes {string}")
    public void the_user_deletes(String string) {

        calendarEventPagePm.repeatEveryNumber.sendKeys("");

    }
    @Then("user sees error message {string}")
    public void user_sees_error_message(String string) {

    }


}
