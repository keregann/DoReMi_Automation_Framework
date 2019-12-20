package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class FlightsTabPage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    WebElement flightsTab;

    @FindBy(xpath = "//label[contains(text(),'One Way')]")
    WebElement oneWayButton;

    @FindBy(xpath = "//label[contains(text(),'Round Trip')]")
    WebElement roundTripButton;

    @FindBy(xpath = "//span[contains(text(),'Economy')]")
    WebElement dropDownList;

    @FindBy(xpath = "//div[@id='s2id_location_from']//a[@class='select2-choice']")
    WebElement from;

    @FindBy(xpath = "//div[@id='s2id_location_to']//a[@class='select2-choice']")
    WebElement to;

    @FindBy(xpath = "//input[@id='FlightsDateStart']")
    WebElement departCalendar;

    @FindBy(xpath = "//input[@id='FlightsDateEnd']")
    WebElement returnCalendar;

    @FindBy(xpath = "//input[@name='fadults']")
    WebElement adults;

    @FindBy(xpath = "//input[@name='fchildren']")
    WebElement child;

    @FindBy(xpath = "//input[@name='finfant']")
    WebElement infant;

    @FindBy(xpath = "//div[@class='col-4']//button[@class='btn btn-white bootstrap-touchspin-up ']")
    WebElement plus;

    @FindBy(xpath = "//div[@class='col-4']//button[@class='btn btn-white bootstrap-touchspin-down ']")
    List<WebElement> minus;

    @FindBy(xpath = "//div[@class='col-xs-12 col-md-1']//button[contains(text(),'Search')]")
    WebElement searchButton;
}


