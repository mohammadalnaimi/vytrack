package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US008_Calendar_Event_Page_PM extends BasePage{

    @FindBy (linkText = "Activities")
    public WebElement activitiesButton;

    @FindBy (linkText = "Calendar Events")
    public WebElement calendarEventsBtn;

//
    @FindBy (xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;



    @FindBy (xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatBtn;



    @FindBy (xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryBox;

    @FindBy (xpath = "(//input[@class='recurrence-subview-control__number error'])[1]")
    public WebElement repeatEveryBox0;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[4]")
    public WebElement errorText;

 
    @FindBy (xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEveryBox1;

    @FindBy ( xpath =  "//span[@class='validation-failed']")
    public WebElement errorMessage;

    @FindBy (xpath = "//span[@class='validation-failed']")
    public WebElement invalidValue;



}
