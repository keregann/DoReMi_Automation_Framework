package com.endava.framework.pageObject;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class UserAccountPage extends BasePage {
    private final String url = "https://www.phptravels.net/account/";

    @FindBy(xpath = "//h3[@class='text-align-left']")
    private WebElement userAccountPage;

    @FindBy(xpath = "//a[@class='dropdown-item tr']")
    private WebElement logOut;

    @FindBy(xpath = "//a[@class='dropdown-item active tr']")
    private WebElement account;

    @FindBy(xpath = "//a[@class='nav-link go-text-right active']")
    private WebElement bookings;

    @FindBy(xpath = "//a[contains(text(),'My Profile')]")
    private WebElement myProfile;

    @FindBy(xpath = "//a[contains(text(),'Wishlist')]")
    private WebElement wishlist;

    @FindBy(xpath = "//a[@class='go-text-right nav-link']")
    private WebElement newsletter;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")
    private WebElement myAccount;

    @FindBy(xpath = "//a[contains(text(),'Hotels')]")
    private WebElement hotels;

}
