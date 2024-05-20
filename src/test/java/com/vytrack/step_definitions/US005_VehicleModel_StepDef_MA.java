package com.vytrack.step_definitions;

import com.vytrack.pages.US005_VehicleModel_Page_MA;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US005_VehicleModel_StepDef_MA {

    US005_VehicleModel_Page_MA vehicleModelPageMa = new US005_VehicleModel_Page_MA();

    @When("user click on Vehicles Model")
    public void user_click_on_vehicles_model() {

        vehicleModelPageMa.vehiclesModel.click();


    }
    @Then("Verify user see below information in the columns")
    public void verify_user_see_below_information_in_the_columns(List<String> expectedInColumns) {

        BrowserUtils.waitForTitleContains("Vehicles Model");
        List<String> actualColumns_as_STRING = new ArrayList<>();
        for (WebElement each : vehicleModelPageMa.listOfColumns) {
            actualColumns_as_STRING.add(each.getText());
        }
        Assert.assertEquals(expectedInColumns,actualColumns_as_STRING);

    }


    @Then("Verify user sees {string}")
    public void verifyUserSees(String errorMassageOnScreen) {

       vehicleModelPageMa.btnClickBack.click();
       BrowserUtils.waitForTitleContains("Dashboard");
        Assert.assertEquals(vehicleModelPageMa.errorMassage.getText(),errorMassageOnScreen);

    }
}
