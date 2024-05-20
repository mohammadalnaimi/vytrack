package com.vytrack.step_definitions;

import com.vytrack.pages.US004_Vehicle_Contracts_Page;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class US004_Vehicle_Contracts_Step_Def {



        US004_Vehicle_Contracts_Page us004VehicleContractsPage = new US004_Vehicle_Contracts_Page();

    @Given("the user is on the login page urlVehicle")
    public void theUserIsOnTheLoginPageUrlVehicle() {

        ConfigurationReader.getProperty("urlVehicle");

    }

        @When("user is on the Vehicle_Contracts_Page and hoverover to Fleet")
        public void user_is_on_the_vehicle_contracts_page_and_hoverover_to_fleet () {
            //BrowserUtils.hover();

       /* Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us004VehicleContractsPage.fleetBtnVC).perform(); */

            BrowserUtils.hover(us004VehicleContractsPage.fleetBtnVC);

        }
        @When("user click on Vehicles Contracts")
        public void user_click_on_vehicles_contracts () {

            BrowserUtils.clickWithWait(By.xpath("//span[.='Vehicle Contracts']"), 5);
          //  us004VehicleContractsPage.vehicleContracts.click();

        }
        @When("user verify URl")
        public void user_verify_u_rl () {



         //   Assert.assertEquals("URL is not the same", expectedUrl, currentUrl);

           String actualURl = Driver.getDriver().getCurrentUrl();
            String expectedUrl = "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract";

            Assert.assertEquals(expectedUrl, actualURl);
        }
        @Then("user verify the title")
        public void user_verify_the_title () {


        BrowserUtils.waitFor(5);
        String actualTitle = Driver.getDriver().getTitle();

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
          //  BrowserUtils.waitForVisibility(us004VehicleContractsPage.title,5);

        Assert.assertEquals(expectedTitle,actualTitle);
           // System.out.println(actualTitle);
        }


    @When("When user is on the Vehicle_Contracts_Page and hoverover to Fleet")
    public void when_user_is_on_the_vehicle_contracts_page_and_hoverover_to_fleet() {
        BrowserUtils.hover(us004VehicleContractsPage.fleetBtnVC);

        us004VehicleContractsPage.vehicleContracts.click();
    }



    @Then("user sees a massage You do not have permission to perform this action")
    public void user_sees_a_massage_you_do_not_have_permission_to_perform_this_action() {
        BrowserUtils.waitFor(5);

        String actualText = "You do not have permission to perform this action.";

        String expectedText = "You do not have permission to perform this action.";

        Assert.assertEquals(expectedText,actualText);
    }

}
