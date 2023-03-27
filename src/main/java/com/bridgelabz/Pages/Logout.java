package com.bridgelabz.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
    WebDriver driver;
    @FindBy(linkText = "More")
    WebElement moreButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div/div/div[1]/div/div[1]/div[7]/div/div/div/div/div/div")
    WebElement logOut;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div/div/div[1]/div/div[1]/div[4]/div")
    WebElement appearance;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void appearanceChange() throws InterruptedException {
        moreButton.click();
        Thread.sleep(1000);
        appearance.click();
        Thread.sleep(400);
        appearance.click();
        Thread.sleep(400);
        appearance.click();
        Thread.sleep(400);
        appearance.click();
        Thread.sleep(400);
    }

    public void logoutFromInstagram() throws InterruptedException {
        moreButton.click();
        Thread.sleep(1000);
        logOut.click();                                   //To logout from instagram
        Thread.sleep(1000);
    }
}
