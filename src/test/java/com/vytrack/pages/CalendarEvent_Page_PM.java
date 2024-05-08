package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class CalendarEvent_Page_PM {

    @FindBy (xpath = "//li[@class='dropdown dropdown-level-1 active']")

    public WebElement activitiesButton;


    @FindBy (xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventsButton;

    @FindBy (xpath = "//span[.='Create Calendar Event']")
    public WebElement createCalendarEventButton;

    @FindBy (xpath = "//input[@id='recurrence-repeat-view5528']")
    public WebElement repeatButton;

    @FindBy (xpath = "//input[@checked='checked']")
    public WebElement repeatEveryButton;

    @FindBy (xpath = "//input[@name='temp-validation-name-5579']")
    public WebElement repeatEveryNumber;


    @FindBy (xpath = "//span[@id='temp-validation-name-5579-error']")
    public WebElement errorMessage;







}
