package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";

    @FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")
    private WebElement myAccount;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    private WebElement signUpButton;

    @FindBy(xpath = "//a[contains(@class,'text-center flights')]")
    private WebElement flightsTab;
}
