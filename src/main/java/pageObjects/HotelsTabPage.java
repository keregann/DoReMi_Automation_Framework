package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelsTabPage extends BasePage {
    private final String url = "https://www.phptravels.net/m-hotels";

    @FindBy(xpath = "//a[@href='#hotels']")
    private WebElement hotels;

    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement destination;

    @FindBy(xpath = "//input[@id='checkin']")
    private WebElement checkIn;

    @FindBy(xpath = "//input[@id='checkout']")
    private WebElement checkOut;

    @FindBy(xpath = "//div[@class='col-md-2 col-xs-12 o1']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]")
    private WebElement search;

}
