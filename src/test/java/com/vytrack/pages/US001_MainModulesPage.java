package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US001_MainModulesPage extends BasePage{

    @FindBy(xpath = ".//*[@class='nav-multilevel main-menu']/li")
    public List<WebElement> mainModules;
}
