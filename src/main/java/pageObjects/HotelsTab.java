package pageObjects;

import lombok.Getter;
import managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HotelsTab extends BasePage {
    private final String url = "https://www.phptravels.net/index.php";
    private WebDriver driver = WebDriverManager.driver;
    ;

    @FindBy(xpath = "//a[@href='#hotels']")
    private WebElement hotelsBooking;

    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement destinationField;

    @FindBy(xpath = "//input[@id='checkin']")
    private WebElement checkInDate;

    @FindBy(xpath = "//input[@id='checkout']")
    private WebElement checkOutDate;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
    private WebElement adultsAmount;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//button[text() ='+']")
    private WebElement addAdultdButton;

    @FindBy(xpath = "//div[contains(@class,'col o2')]//button[text() ='-']")
    private WebElement substractAdultButton;

    @FindBy(xpath = "//div[contains(@class,'col o1')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
    private WebElement childAmount;

    @FindBy(xpath = "//div[contains(@class,'col 01')]//button[text() ='+']")
    private WebElement addChildButton;

    @FindBy(xpath = "//div[contains(@class,'col 01')]//button[text() ='-']")
    private WebElement substractChildButton;

    @FindBy(xpath = "//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@type,'submit')][contains(text(), 'Search')]")
    private WebElement searchButton;

    public void inputDropDown(WebElement element, String value) throws InterruptedException {
        element.sendKeys(value);
        WebElement foundElement = driver.findElement(By.xpath("//div//span[contains(text(),'" + value + "')]"));
        foundElement.click();
    }

    //must be developed
    public void inputDate(WebElement element, String day) throws InterruptedException {
        element.click(); //can be send outside
        WebElement dayElem = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[1]//div[2]//div[text()='" + day + "']"));
        dayElem.click();
    }


    public void setAdultsAmount(String amount) {
        int temp = Integer.parseInt(amount);
        if (temp == 1) {
            substractAdultButton.click();
        } else if (temp > 2) {
            for (int i = 3; i <= temp; i++) {
                addAdultdButton.click();
            }
        }
    }

    public void setChildAmount(String amount) {
        int temp = Integer.parseInt(amount);
        for (int i = 1; i <= temp; i++) {
            addChildButton.click();
        }
    }
}
