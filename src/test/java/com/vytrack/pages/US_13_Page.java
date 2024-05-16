package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_13_Page extends BasePage{

    @FindBy(linkText ="Fleet")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCostsButton;


    @FindBy(xpath = "//span[.='Type'][1]")
    public WebElement typeColumn;

    @FindBy(xpath = "//span[.='Total Price'][1]")
    public WebElement totalPriceColumn;

    @FindBy(xpath = "//span[.='Date'][1]")
    public WebElement dateColumn;

    @FindBy(xpath = "//div[@class='btn-group dropdown']/button/input")
    public WebElement firstCheckBoxButton;


}
