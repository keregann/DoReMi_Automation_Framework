package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class ToursTabPage extends BasePage {

    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "//div[@id='s2id_autogen8']")
    WebElement destination;

    @FindBy(xpath = "//ul[@class='select2-results']//ul//li")
    List<WebElement> destinationOptions;

    @FindBy(xpath = "//div[@id='tourtype_chosen']")
    WebElement tourType;

    @FindBy(xpath = "//div[@class='chosen-drop']//ul//li[@class='active-result']")
    List<WebElement> tourTypeOptions;

    @FindBy(xpath = "//input[@id='DateTours']")
    WebElement date;

    @FindBy(xpath = "//div[contains(@class,'col-md-12')]//input[@placeholder='0']")
    WebElement adults;

//    @FindBy(xpath = "//div[@class='col-4']//button[@class='btn btn-white bootstrap-touchspin-up ']")
//    WebElement plus;

    @FindBy(xpath = "//div[@class='col-md-2 col-xs-12']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]")
    WebElement searchButton;

}
