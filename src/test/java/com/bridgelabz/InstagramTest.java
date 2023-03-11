package com.bridgelabz;
import com.bridgelabz.Pages.LoginPage;
import com.bridgelabz.Pages.RegistrationToInsta;
import com.bridgelabz.base.BaseClass;
import com.bridgelabz.utility.DataProviderLogic;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InstagramTest extends BaseClass {
    RegistrationToInsta registration;
    LoginPage login;

    @BeforeMethod
    public void initialization() {
        setUp();
        registration = new RegistrationToInsta(driver);
        login = new LoginPage(driver);
    }

    @Test(priority = 0)
    public void redirect_To_SignUp() throws InterruptedException {
        String title = registration.redirectOnToTheSignUpScreen();
        Assert.assertEquals("Instagram",title);
    }

    @Test(priority = 1)
    public void insertData_RegistrationForm() {
        registration = new RegistrationToInsta(driver);
        boolean isEnable = registration.enterDataInToTheRegistrationForm();
        Assert.assertEquals(true,isEnable);
    }

    @Test(priority = 2, dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void loginIn_To_Instagram(String userName, String password) throws InterruptedException {
        login.loginInToTheInstagram(userName, password);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
}


}
