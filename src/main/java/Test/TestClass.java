package Test;


import cucumber.stepdefs.BaseTest;
import cucumber.stepdefsMargarita.StepdefsMargarita;
import org.apache.log4j.Logger;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SingUpPage;
import pageObjects.UserAccountPage;

public class TestClass extends BaseTest {
    //static WebDriver driver;
    // private ActionClass actionClass = new ActionClass();
    private HomePage homePageObjects = new HomePage();
    private LoginPage loginPageObjects = new LoginPage();
    private SingUpPage singUpPageObjects = new SingUpPage();
    private UserAccountPage userAccountPageObject= new UserAccountPage();
    private static Logger log = Logger.getLogger(TestClass.class);
    StepdefsMargarita stepdefsMargarita = new StepdefsMargarita();

//    @Test
//    public void experiment(){
//        stepdefsMargarita.user_is_on_the_Home_Page();
//        stepdefsMargarita.clickOnMyAccountDropdown();
//        stepdefsMargarita.clickOnLOGINButton();
//        stepdefsMargarita.userEnterValidEmailAndPassword();
//    }

//    @Test
//    public void runTest() throws InterruptedException {
//
//        homePageObjects.clickMyAccount();
//        homePageObjects.clickLogin();
//        loginPageObjects.inputData("margarita.gabureac@endava.com", "0123456");
//        loginPageObjects.getLoginButton().click();
//        userAccountPageObject.clickUser();
//        userAccountPageObject.clickLogOut();
//
//        log.debug("Start test!!!");
//        log.error("Error!!");
//    }
//
//    @Test
//    public void secondTest(){
//        homePageObjects.clickMyAccount();
//        homePageObjects.clickSingUp();
//        singUpPageObjects.enterUserData("Gabureac","Margarita","068305499","margaritaq.mail.ru","0123456");
//
//    }




}
