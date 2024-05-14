package com.vytrack.step_definitions;

import com.vytrack.pages.US002_OroIncDocumentationPage_AR;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class US002_OroIncDocumentationStepDef_AR {

    US002_OroIncDocumentationPage_AR oroIncDocumentationPageAr = new US002_OroIncDocumentationPage_AR();

    @When("User is on Vytrack home page and clicks on question mark")
    public void user_is_on_vytrack_home_page_and_clicks_on_question_mark() {

        oroIncDocumentationPageAr.questionMark.click();
    }
    @Then("User sees the new tab opens with OroInc Documentation website")
    public void user_sees_the_new_tab_opens_with_oro_inc_documentation_website() {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for(String each: allWindowHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains("oroinc")){
                break;
            }
        }

        String expectedURL = "https://doc.oroinc.com/";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);
    }
}
