package com.vytrack.step_definitions;

import com.vytrack.pages.US003_Pinbar_Page_AS;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US003_Pinbar_StepDef_AS {

    US003_Pinbar_Page_AS pinbarPageAs = new US003_Pinbar_Page_AS();

    @Given("the user clicks the {string} link")
    public void the_user_clicks_the_link(String pinbar) {

        pinbarPageAs.spaceLink.click();

    }
    @Then("the user should be able to see title on home page as {string}")
    public void theUserShouldBeAbleToSeeTitleOnHomePageAs(String expectedText) {

    //    BrowserUtils.waitFor(2);
     //   String expectedText = "How To Use Pinbar";
        String actualText = pinbarPageAs.howToUsePinbarTitle.getText().trim();

        Assert.assertEquals(expectedText, actualText);

    }

    @And("the user should be able to see explanation on home page as {string}")
    public void theUserShouldBeAbleToSeeExplanationOnHomePageAs(String expectedText){

      //  BrowserUtils.waitFor(2);
        //String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actualText = pinbarPageAs.howToUsePinbarText.getText().trim();

        Assert.assertEquals(expectedText, actualText);


    }

    @Then("the user should see image from source {string}")
    public void theUserShouldSeeImageFromSource(String expectedSource) {

        String actualSource = pinbarPageAs.howToUsePinbarImage.getText().trim();

        Assert.assertTrue(actualSource.contains(expectedSource));


    }
}



