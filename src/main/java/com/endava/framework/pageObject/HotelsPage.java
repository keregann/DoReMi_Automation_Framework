package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class HotelsPage extends BasePage {

    private final String url = "https://www.phptravels.net/index.php";
    @FindBy(xpath = "//div[@id='listing']//li[*]]")
    private List<WebElement> hotels;
    //first in list >> need to make list (//li[*]//button[contains(text(),'Details')])
    @FindBy(xpath = "//li[1]//button[contains(text(),'Details')]")
    private WebElement detailsButton;

}
