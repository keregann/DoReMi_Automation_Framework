import driver.Singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;
import tabs.HotelsTab;


public class MainClass {

    static WebDriver driver = Singleton.initialize();

    public static void main(String[] args) throws InterruptedException {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
        HotelsTab hotelsTab = PageFactory.initElements(driver, HotelsTab.class);
        HotelsPage hotelsPage = PageFactory.initElements(driver, HotelsPage.class);
        HotelDetailsPage hotelDetailsPage = PageFactory.initElements(driver, HotelDetailsPage.class);
        PaymentDetailsPage paymentDetailsPage = PageFactory.initElements(driver, PaymentDetailsPage.class);


        homePage.clickMyAccount();
        homePage.clickLogin();

        loginPage.inputData("keregann@gmail.com", "1234567890");
        loginPage.clickLoginButton();
        Thread.sleep(5000);
        accountPage.goHome();
        Thread.sleep(5000);
      //  hotelsTab.hotelsBooking.click();
        hotelsTab.inputDestination("Chisinau");
        hotelsTab.inputCheckInDate("9");
        hotelsTab.inputCheckOutDate("12");
        hotelsTab.inputAdultsAmount(2);
        hotelsTab.inputChildAmount(0);
        hotelsTab.searchHotelButton();
        //  hotelsPage.seeHotelDetails();
        hotelDetailsPage.navigatePriceSection();
        hotelDetailsPage.bookHotel();
        paymentDetailsPage.inputBookingInformation("Mr","Ion", "Ghincolov", "keregan@email.com", "Romania", "012345678");
        paymentDetailsPage.inputCardDetails("Ion Ghincolov", "1234567890123456" , 01, 2020, 120);
        Thread.sleep(10000);
        paymentDetailsPage.completeBooking();
    }
}
