package com.bridgelabz;
import com.bridgelabz.Pages.*;
import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.TestNGListener;
import com.bridgelabz.utility.DataProviderLogic;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;


@Listeners(TestNGListener.class)
public class InstagramTest extends BaseClass {
    RegistrationToInsta registration;
    LoginPage login;
    HomePage home;
    Profile profilePic;

    Logout logout;

    Explore explore;
    Reels likeReel;

    @BeforeMethod
    public void initialization(){
        setUp();
        registration = new RegistrationToInsta(driver);
        login = new LoginPage(driver);
        home = new HomePage(driver);
        profilePic = new Profile(driver);
        logout = new Logout(driver);
        explore = new Explore(driver);
        likeReel = new Reels(driver);
    }

    @Test(priority = 0)
    public void redirect_To_SignUp() throws InterruptedException {
        String title = registration.redirectOnToTheSignUpScreen();
        Assert.assertEquals("Instagram", title);
    }

    @Test(priority = 1)
    public void insertData_RegistrationForm() {
        registration = new RegistrationToInsta(driver);
        boolean isEnable = registration.enterDataInToTheRegistrationForm();
        Assert.assertEquals(true, isEnable);
    }

    @Test(priority = 2, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void loginIn_LogOut(String userName, String password) throws InterruptedException, AWTException {
        login.loginInToTheInstagram(userName, password);
        Thread.sleep(5000);
        logout.appearanceChange();
        Thread.sleep(500);
        explore.exploreInstagram();
        logout.logoutFromInstagram();
        Thread.sleep(3000);
    }
    @Test(priority = 3, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void changeProfilePic(String userName, String password) throws IOException, InterruptedException, AWTException {
        login.loginInToTheInstagram(userName, password);
        Thread.sleep(5000);
        profilePic.changeProfilePic();
        Thread.sleep(7000);
        logout.logoutFromInstagram();
        Thread.sleep(3000);
    }

    @Test(priority = 4, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void searchAndFollow(String userName, String password) throws InterruptedException, AWTException {
        login.loginInToTheInstagram(userName, password);
        Thread.sleep(5000);
        home.instagramLoginActivities();
        Thread.sleep(500);
        logout.logoutFromInstagram();
        Thread.sleep(3000);
    }

    @Test(priority = 5, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void exploreReelsAndLike(String userName, String password) throws InterruptedException, AWTException {
        login.loginInToTheInstagram(userName, password);
        Thread.sleep(5000);
        explore.exploreInstagram();
        Thread.sleep(2000);
        likeReel.likeReels();
        Thread.sleep(1000);
        logout.logoutFromInstagram();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }


}
