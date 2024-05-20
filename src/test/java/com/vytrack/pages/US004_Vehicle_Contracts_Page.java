package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US004_Vehicle_Contracts_Page extends BasePage {



    @FindBy(id = "prependedInput")
    public WebElement loginVehicleContract;

    @FindBy(id = "prependedInput2")
    public WebElement passwordVehicleContract;

    @FindBy(id = "_submit")
    public WebElement loginBTN;

    @FindBy (linkText = "Fleet")
    public WebElement fleetBtnVC;

    // Vehicle contracts

    @FindBy (xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContracts;

    @FindBy (xpath = "//title[.='All - Vehicle Contract - Entities - System - Car - Entities - System']")
    public WebElement title;

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMSG;


}
