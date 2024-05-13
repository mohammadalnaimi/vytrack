package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US007_VehicleGenerate_Page_MA extends BasePage{

@FindBy(linkText = "Fleet")
    public WebElement fleetDropDown;

@FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehiclesLink;

@FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> listOfCheckBox ;

@FindBy(xpath = "(//button[@data-toggle='dropdown'])//input")
    public WebElement mainCheckBox;

@FindBy(xpath = "//td[text()='silver']//preceding-sibling::td[13]//input")
    public WebElement checkBoxHasSilverValue;

@FindBy(xpath = "//tbody[@class='grid-body']//tr[4]//input")
    public WebElement fourthCheckBox;


}
