package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class FlightsResultsPage extends BasePage {
    private final String url = "https://www.phptravels.net/";

    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[2]//form[1]//div[2]//div[1]//button[1]")
    WebElement bookNowBtn;

}
