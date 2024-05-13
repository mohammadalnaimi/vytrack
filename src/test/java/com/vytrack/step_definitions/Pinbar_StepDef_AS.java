package com.vytrack.step_definitions;

import com.vytrack.pages.Pinbar_Page_AS;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Pinbar_StepDef_AS {

    Pinbar_Page_AS pinbarPageAs = new Pinbar_Page_AS();

    @Given("the user clicks the {string} link")
    public void the_user_clicks_the_link(String pinbar) {

        pinbarPageAs.spaceLink.click();

    }
    @Then("the user should see {string}")
    public void the_user_should_see() {

        BrowserUtils.waitFor(2);
        String expectedText = "How To Use Pinbar";
        String actualText = pinbarPageAs.howToUsePinbarTitle.getText();

        Assert.assertEquals(expectedText, actualText);

    }
    @Then("the user should see \"Use the pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void the_user_should_see_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {

        BrowserUtils.waitFor(2);
        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actualText = pinbarPageAs.howToUsePinbarText.getText();

        Assert.assertEquals(expectedText, actualText);

    }
    @Then("the user should see image from source {string}")
    public void the_user_should_see_image_from_source(String string) {

    }

}
