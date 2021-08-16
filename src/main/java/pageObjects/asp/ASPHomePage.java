package pageObjects.asp;

import lombok.Data;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

@Data
public class ASPHomePage extends BasePage {

    private final static String IDNP = "2005001245678";
    private final static String SCHOOL_DOC_NUMBER = "123456789";
    private final static String FIRSTNAME = "Ana";
    private final static String LASTNAME = "Botan";
    private final static String PHONE = "078546293";
    private final static String EMAIL = "ana.botan@yahoo.com";

    @FindBy(xpath = " //*[@id=\"serviceId\"]/option[3]")
    WebElement serviceDropDown;

    @FindBy(xpath = "//*[@id=\"terms\"]/p/input[1]")
    WebElement conditionTick1;
    @FindBy(xpath = "//*[@id=\"terms\"]/p/input[2]")
    WebElement conditionTick2;
    @FindBy(xpath = "//*[@id=\"terms\"]/p/input[3]")
    WebElement conditionTick3;

    @FindBy(xpath = "//*[@id=\"idnp\"]")
    WebElement idnp;

    @FindBy(xpath = "//*[@id=\"schoolDocNr\"]")
    WebElement schoolDocNumber;

    @FindBy(xpath = "//*[@id=\"officeId\"]/option[13]")
    WebElement locationChisinau;

    @FindBy(xpath = "//*[@id=\"btnCheck\"]")
    WebElement btnCheck;

    @FindBy(xpath = "//*[@id=\"datepicker\"]/div/div[2]/table/tbody/tr[4]/td[2]")
    WebElement date;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    WebElement phone;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"confirmEmail\"]")
    WebElement confirmEmail;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[20]/div")
    WebElement robotBtn;

    @FindBy(xpath = "//*[@id=\"datepicker\"]/div/div[2]/table")
    WebElement datesTable;

    @FindBy(xpath = "//*[@id=\"hourpicker\"]/div/*\n")
    WebElement hoursTable;

    public void goToHomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void register() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //1. Selectați condițiile pentru programarea la serviciu
        serviceDropDown.click();
        conditionTick1.click();
        conditionTick2.click();
        conditionTick3.click();
        idnp.sendKeys(IDNP);
        schoolDocNumber.sendKeys(SCHOOL_DOC_NUMBER);
        locationChisinau.click();

        //Set date and time
        btnCheck.click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,400)");
        clickFirstAvailableDate();
//        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        clickFirstAvailableHour();

        //2. Completați datele de contact
        firstName.sendKeys(FIRSTNAME);
        lastName.sendKeys(LASTNAME);
        phone.sendKeys(PHONE);
        email.sendKeys(EMAIL);
        confirmEmail.sendKeys(EMAIL);

        js.executeScript("window.scrollBy(0,500)");
//        robotBtn.click();
    }

    private void clickFirstAvailableDate() {
        datesTable.findElements(By.xpath("//*[@id=\"datepicker\"]/div/div[2]/table/tbody/*/*")).stream()
                .filter(i -> !i.getText().trim().isEmpty()
                        && i.getAttribute("title").startsWith("Disponibil")).findFirst().get().click();
    }

    private void clickFirstAvailableHour() {
        hoursTable.findElements(By.xpath("//*[@id=\"hourpicker\"]/div/*\n")).stream()
                .filter(i -> !i.getText().trim().isEmpty()
                        && i.getAttribute("title").startsWith("Disponibil")).findFirst().get().click();
    }
}
