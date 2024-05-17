package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US003_Pinbar_Page_AS extends BasePage{

    @FindBy(xpath ="//a[.='Learn how to use this space']")
    public WebElement spaceLink;

    @FindBy(xpath = "//div[@class='container-fluid']//h3")
    public WebElement howToUsePinbarTitle;

    @FindBy (xpath = "//p['Use pin icon on the right top corner of page to create fast access link in the pinbar.'][1]")
    public WebElement howToUsePinbarText;

    @FindBy (xpath = "//img['/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement howToUsePinbarImage;










}
