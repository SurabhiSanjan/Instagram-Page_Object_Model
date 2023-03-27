package com.bridgelabz.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.KeyEvent;

public class HomePage {
    WebDriver driver;

    @FindBy(linkText = "Search")
    WebElement searchButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div/input")
    WebElement searchbar;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div/header/section/div[1]/div[2]/div/div[1]/button/div/div")
    WebElement followButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void instagramLoginActivities() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        searchButton.click();
        Thread.sleep(1000);
        searchbar.sendKeys("selena");        //To search profile by name
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        followButton.click();                      //To follow profile
    }
}
