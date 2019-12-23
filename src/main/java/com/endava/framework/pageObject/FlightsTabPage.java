package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class FlightsTabPage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    private WebElement flightsTab;

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    private WebElement oneWayButton;

    @FindBy(xpath = "//label[contains(text(),'Round Trip')]")
    private WebElement roundTripButton;

    @FindBy(xpath = "//div[@class='form-icon-left flightclass']")
    private WebElement flightClass;

    @FindBy(xpath = "//ul[@class='chosen-results']//li")
    private List<WebElement> flightClassOptions;

    @FindBy(xpath = "//div[@id='s2id_location_from']//a[@class='select2-choice']")
    private WebElement from;

    @FindBy(xpath = "//div[@id='s2id_location_to']//a[@class='select2-choice']")
    private WebElement to;

    @FindBy(xpath = "//input[@id='FlightsDateStart']")
    private WebElement departCalendar;

    @FindBy(xpath = "//input[@id='FlightsDateEnd']")
    private WebElement returnCalendar;

    @FindBy(xpath = "//input[@name='fadults']")
    private WebElement adults;

    @FindBy(xpath = "//input[@name='fchildren']")
    private WebElement child;

    @FindBy(xpath = "//input[@name='finfant']")
    private WebElement infant;

    @FindBy(xpath = "//div[@class='col-4']//button[@class='btn btn-white bootstrap-touchspin-up ']")
    private WebElement plus;

    @FindBy(xpath = "//div[@class='col-4']//button[@class='btn btn-white bootstrap-touchspin-down ']")
    private List<WebElement> minus;

    @FindBy(xpath = "//div[@class='col-xs-12 col-md-1']//button[contains(text(),'Search')]")
    private WebElement searchButton;


}


