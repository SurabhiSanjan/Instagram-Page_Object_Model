package com.bridgelabz.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Profile {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[8]/div/div/a/div/div[2]/div/div")
    WebElement profile;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div/header/div/div/div/button/img")
    WebElement profilePic;

    public Profile(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void changeProfilePic() throws InterruptedException, IOException, AWTException {
        Robot robot = new Robot();
        profile.click();
        Thread.sleep(3000);
        profilePic.click();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(6000);
        profilePic.click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("C:\\Users\\atulk\\OneDrive\\Desktop\\instaPic.exe");
        Thread.sleep(3000);
        System.out.println("Profile Pic Changed Successfully");
    }
}
