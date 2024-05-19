package com.vytrack.step_definitions;

import com.vytrack.pages.US001_MainModulesPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US001_MainModules_StepDef {

    US001_MainModulesPage mainModulesPage = new US001_MainModulesPage();


    @Then("users sees {int} modules names in the home page")

    public void usersSeesModulesNamesInTheHomePage(int arg0) {

        List<String> actualModulesText = new ArrayList<>();

        for (WebElement eachMainModule : mainModulesPage.mainModules) {

            BrowserUtils.sleep(1);
            actualModulesText.add(eachMainModule.getText().trim());

        }

        System.out.println("actualModulesText = " + actualModulesText);


        List<String> expectedModulesText = new ArrayList<>(Arrays.asList("Dashboards","Fleet","Customers","Sales","Activities","Marketing","Reports & Segments","System"));

        Assert.assertEquals(expectedModulesText, actualModulesText);

    }






    @Then("driver users sees {int} modules in the home page")
    public void driverUsersSeesModulesInTheHomePage(int arg0) {

        BrowserUtils.sleep(2);
        List<String> actualModulesText = BrowserUtils.getElementsText(mainModulesPage.mainModules);

        List<String> expectedModulesText = new ArrayList<>(Arrays.asList("Fleet","Customers","Activities","System"));
        Assert.assertEquals(expectedModulesText,actualModulesText);

          /*
        List<String> actualModulesText = new ArrayList<>();

        for (WebElement eachMainModule : mainModulesPage.mainModules) {

            BrowserUtils.sleep(1);
            actualModulesText.add(eachMainModule.getText().trim());

        }

         */


    }
}




