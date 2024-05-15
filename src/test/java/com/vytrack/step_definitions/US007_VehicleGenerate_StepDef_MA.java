package com.vytrack.step_definitions;

import com.vytrack.pages.US007_VehicleGenerate_Page_MA;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US007_VehicleGenerate_StepDef_MA {

    US007_VehicleGenerate_Page_MA vehicleGeneratePageMa = new US007_VehicleGenerate_Page_MA();


    @When("user hover over  Fleet")
    public void userHoverOverFleet() {

       // Actions actions = new Actions(Driver.getDriver());
       // actions.moveToElement(vehicleGeneratePageMa.fleetDropDown).perform();
        BrowserUtils.hover(vehicleGeneratePageMa.fleetDropDown);

    }

    @When("user click on Vehicles")
    public void user_click_on_vehicles() {

        vehicleGeneratePageMa.vehiclesLink.click();
    }

    @Then("Verify user see all the checkboxes as unchecked")
    public void verify_user_see_all_the_checkboxes_as_unchecked() {

        boolean isUnchecked = true;
        for (WebElement each : vehicleGeneratePageMa.listOfCheckBox) {
            if (each.isSelected()){
                isUnchecked = false;
                break;
            }
        }
        boolean isMainCheckBox = true;
        if (vehicleGeneratePageMa.mainCheckBox.isSelected()){
            isMainCheckBox=false;
        }

        Assert.assertTrue(isUnchecked == true && isMainCheckBox == true);
    }


    @Then("verify all checkboxes are selected")
    public void verifyAllCheckboxesAreSelected() {



        for (WebElement eachCheckBox : vehicleGeneratePageMa.listOfCheckBox) {
            Assert.assertTrue(eachCheckBox.isSelected());
        }

    }

    @And("user click on the first checkbox")
    public void userClickOnTheFirstCheckbox() {
        vehicleGeneratePageMa.mainCheckBox.click();
    }



  /*
    @Then("verify the checkbox user clicked on is selected")
    public void verifyTheCheckboxUserClickedOnIsSelected() {
        Assert.assertTrue(vehicleGeneratePageMa.fourthCheckBox.isSelected());
    }



    @And("user click on the forth checkbox")
    public void userClickOnTheForthCheckbox() {

        vehicleGeneratePageMa.fourthCheckBox.click();

    }
   */

    @And("user select any car")
    public void userSelectAnyCar() {
        BrowserUtils.waitForTitleContains("All - Car - Entities");
        BrowserUtils.selectAnyCheckBox(vehicleGeneratePageMa.listOfCheckBox);
        boolean expectedSelection = true;
        boolean actualSelection = BrowserUtils.isSelectedCheckBox(vehicleGeneratePageMa.listOfCheckBox);
        Assert.assertEquals(expectedSelection,actualSelection);
    }
}
