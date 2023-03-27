package com.bridgelabz.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Reels {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div/div[1]/div/div[2]/div[1]/span/button/div[2]")
    WebElement like;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div")
    WebElement reelPage;
    @FindBy(linkText = "Reels")
    WebElement reelButton;

    public Reels(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void likeReels() throws InterruptedException, AWTException {
        Robot robot= new Robot();
        reelButton.click();
        Thread.sleep(3000);
        reelPage.click();
        for (int i = 1; i<=5; i++){
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(500);;
       }
        like.click();
        Thread.sleep(500);
    }
}
