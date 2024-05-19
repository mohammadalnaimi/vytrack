package com.vytrack.step_definitions;

import com.vytrack.pages.US_13_Page;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_13_StepDefinitions {
US_13_Page page = new US_13_Page();

    @When("user should hover over  Fleet button")
    public void user_should_hover_over_fleet_button() {
        BrowserUtils.hover(page.fleetButton);

    }
    @When("user should move and click on Vehicle Costs")
    public void user_should_move_and_click_on_vehicle_costs() {
        page.vehicleCostsButton.click();

    }
    @Then("user should see {string} , {string}, {string} columns on the Vehicle")
    public void user_should_see_columns_on_the_vehicle(String type, String totalPrice, String date) {

        BrowserUtils.verifyElementDisplayed(page.typeColumn);
        BrowserUtils.verifyElementDisplayed(page.totalPriceColumn);
        BrowserUtils.verifyElementDisplayed(page.dateColumn);

    }


    @Then("user should click on first  checkbox button")
    public void userShouldClickOnFirstCheckboxButton() {
        page.firstCheckBoxButton.click();

    }
}
