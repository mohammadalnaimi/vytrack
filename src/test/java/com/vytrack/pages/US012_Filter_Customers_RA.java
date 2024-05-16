package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US012_Filter_Customers_RA extends BasePage {

    @FindBy (linkText = "Customers")
    public WebElement customersDropdown;

    @FindBy (xpath = "(//span [.= 'Accounts'])[1]")
    public WebElement accountsPage;

    @FindBy (xpath = "//a [@title = 'Filters']")
    public WebElement filterButton;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[1]")
    public WebElement accountName;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[2]")
    public WebElement contactName;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[3]")
    public WebElement contactEmail;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[4]")
    public WebElement contactPhone;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[5]")
    public WebElement owner;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[6]")
    public WebElement businessUnit;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[7]")
    public WebElement createdAt;

    @FindBy(xpath = "(//div [@class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[8]")
    public WebElement updatedAt;




}
