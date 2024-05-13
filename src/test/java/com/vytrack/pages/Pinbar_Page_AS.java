package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Pinbar_Page_AS extends BasePage{

    @FindBy(xpath ="//a[.='Learn how to use this space']")
    public WebElement spaceLink;

    @FindBy (xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinbarTitle;

    @FindBy (linkText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.")
    public WebElement howToUsePinbarText;











}
