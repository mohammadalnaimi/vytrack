package com.vytrack.step_definitions;

import com.vytrack.pages.US007_VehicleGenerate_Page_MA;
import com.vytrack.pages.US012_Filter_Customers_RA;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US012_Filter_Customers_StepDef_RA {

    US012_Filter_Customers_RA us012FilterCustomersRa = new US012_Filter_Customers_RA();

    @When("the user hovers on Customers module")

    public void the_user_hovers_on_customers_module() {
        BrowserUtils.hover(us012FilterCustomersRa.customersDropdown);
    }

    @When("the user clicks on Accounts")
    public void the_user_clicks_on_accounts() {
        us012FilterCustomersRa.accountsPage.click();
    }

    @And("the user clicks on Filter Icon")
    public void theUserClicksOnFilterIcon() {
        us012FilterCustomersRa.filterButton.click();
    }

    @Then("verify user can see all {int} filter items")
    public void verify_user_can_see_all_filter_items(Integer int1) {

        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.accountName);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.contactName);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.contactEmail);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.contactPhone);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.owner);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.businessUnit);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.createdAt);
        BrowserUtils.verifyElementDisplayed(us012FilterCustomersRa.updatedAt);


    }


}
