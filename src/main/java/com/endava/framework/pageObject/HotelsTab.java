package com.endava.framework.pageObject;

import com.endava.framework.manager.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelsTab extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";
    private WebDriver driver = WebDriverManager.driver;

    @FindBy(xpath = "//a[@href='#hotels']")
    private WebElement hotels;

    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement destination;

    @FindBy(xpath = "//input[@id='checkin']")
    private WebElement checkIn;

    @FindBy(xpath = "//input[@id='checkout']")
    private WebElement checkOut;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
    private WebElement adultsAmount;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//button[text() ='+']")
    private WebElement addAdult;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//button[text() ='-']")
    private WebElement substractAdult;

    @FindBy(xpath = "//div[contains(@class,'col o1')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
    private WebElement childAmount;

    @FindBy(xpath = "//div[contains(@class,'col 01')]//button[text() ='+']")
    private WebElement addChild;

    @FindBy(xpath = "//div[contains(@class,'col 01')]//button[text() ='-']")
    private WebElement substractChild;

    @FindBy(xpath = "//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@type,'submit')][contains(text(), 'Search')]")
    private WebElement search;

    public void setAdultsAmount(String amount) {
        int temp = Integer.parseInt(amount);
        if (temp == 1) {
            substractAdult.click();
        } else if (temp > 2) {
            for (int i = 3; i <= temp; i++) {
                addAdult.click();
            }
        }
    }

    public void setChildAmount(String amount) {
        int temp = Integer.parseInt(amount);
        for (int i = 1; i <= temp; i++) {
            addChild.click();
        }
    }
}
