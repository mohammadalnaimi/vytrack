package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US005_VehicleModel_Page_MA extends BasePage{

@FindBy(xpath = "//span[text()='Vehicles Model']")
    public WebElement vehiclesModel;

@FindBy(xpath = "//th/a")
    public List<WebElement> listOfColumns;

@FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement errorMassage;

@FindBy(xpath = "//button[@class='btn-primary']")
public WebElement btnClickBack;



}
