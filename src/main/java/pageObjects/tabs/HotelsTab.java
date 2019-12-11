//package pageObjects.tabs;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import pageObjects.BasePage;
//
//
//public class HotelsTab extends BasePage {
////    private WebDriver driver;
////
////    public HotelsTab(WebDriver driver) {
////        this.driver = driver;
////    }
//
//    @FindBy(xpath = "//a[@href='#hotels']")
//    WebElement hotelsBooking;
//
//    @FindBy(xpath = "//input[@id='s2id_autogen2']")
//    private
//    WebElement destinationField;
//
//    @FindBy(xpath = "//input[@id='checkin']")
//    private
//    WebElement checkInDate;
//
//    @FindBy(xpath = "//input[@id='checkout']")
//    private
//    WebElement checkOutDate;
//
//    @FindBy(xpath = "//div[contains(@class,'col o2')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
//    private WebElement adultsAmount;
//
//    @FindBy(xpath = "//div[contains(@class,'col o2')]//button[text() ='+']")
//    private WebElement addAdultdButton;
//
//    @FindBy(xpath = "//div[contains(@class,'col o2')]//button[text() ='-']")
//    private WebElement substractAdultButton;
//
//    @FindBy(xpath = "//div[contains(@class,'col o1')]//div[contains(@class,'bootstrap-touchspin bootstrap-touchspin-injected')]")
//    private WebElement childAmount;
//
//    @FindBy(xpath = "//div[contains(@class,'col 01')]//button[text() ='+']")
//    private WebElement addChildButton;
//
//    @FindBy(xpath = "//div[contains(@class,'col 01')]//button[text() ='-']")
//    private WebElement substractChildButton;
//
//    @FindBy(xpath = "//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@type,'submit')][contains(text(), 'Search')]")
//    private WebElement searchButton;
//
//    public HotelsTab inputDestination(String value) throws InterruptedException {
//        destinationField.sendKeys(value);
//        Thread.sleep(1000);
//        WebElement foundDestination = driver.findElement(By.xpath("//div//span[contains(text(),'" + value + "')]"));
//        foundDestination.click();
//        return this;
//    }
//
//    //must be developed
//    public HotelsTab inputCheckInDate(String day) throws InterruptedException {
//        checkInDate.click();
//        WebElement prevLink = driver.findElement(By.xpath("//div[1]//nav[1]//div[1]"));
//        WebElement midLink = driver.findElement(By.xpath("//div[1]//nav[1]//div[2]"));
//        WebElement nextLink = driver.findElement(By.xpath("//div[1]//nav[1]//div[3]"));
//        //  nextLink.click();
//        Thread.sleep(2000);
//        WebElement dayElem = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[1]//div[1]//div[1]//div[2]//div[text()='" + day + "']"));
//        dayElem.click();
//        return this;
//    }
//
//    //must be developed
//    public HotelsTab inputCheckOutDate(String day) throws InterruptedException {
//        checkOutDate.click();
//        WebElement prevLink = driver.findElement(By.xpath("//div[2]//nav[1]//div[1]"));
//        WebElement midLink = driver.findElement(By.xpath("//div[2]//nav[1]//div[2]"));
//        WebElement nextLink = driver.findElement(By.xpath("//div[2]//nav[1]//div[3]"));
//        //  nextLink.click();
//        Thread.sleep(2000);
//        WebElement dayElem = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[1]//div[2]//div[text()='" + day + "']"));
//        dayElem.click();
//        return this;
//    }
//
//    //i cannot check set amount to compare with requiered
//    public HotelsTab inputAdultsAmount(int amount) {
//        if (amount == 1) {
//            substractAdultButton.click();
//        } else if (amount > 2) {
//            for (int i = 3; i <= amount; i++) {
//                addAdultdButton.click();
//            }
//        }
//        return this;
//    }
//
//    //i cannot check set amount to compare with requiered
//    public HotelsTab inputChildAmount(int amount) {
//        for (int i = 1; i <= amount; i++) {
//            addChildButton.click();
//        }
//        return this;
//    }
//
//    public HotelsTab searchHotelButton() {
//        searchButton.click();
//        return this;
//    }
//
//
//}
