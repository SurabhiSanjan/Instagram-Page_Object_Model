package com.bridgelabz.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Explore {

    WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div/a/div/div[2]/div/div")
    WebElement exploreButton;

    public Explore(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void exploreInstagram() throws InterruptedException, AWTException {
        Robot robot= new Robot();
        exploreButton.click();
        Thread.sleep(2000);
        for(int i = 0; i<=37;i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(200);
        }
    }
}
