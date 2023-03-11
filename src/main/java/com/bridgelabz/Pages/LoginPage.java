package com.bridgelabz.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
   WebDriver driver;
   @CacheLookup
   @FindBy(name = "username")
   WebElement userName;

   @CacheLookup
   @FindBy(name = "password")
   WebElement password;

   @CacheLookup
   @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div")
   WebElement loginButton;

   public LoginPage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver,this);
   }

   public void loginInToTheInstagram(String uName, String pass) throws InterruptedException {
      userName.sendKeys(uName);
      Thread.sleep(1000);
      password.sendKeys(pass);
      Thread.sleep(1000);
      loginButton.click();
      Thread.sleep(1000);
      redirectOnToTheHomePage();
   }

   public void redirectOnToTheHomePage() {
      String title = driver.getTitle();
      Assert.assertEquals("Instagram",title);
   }

}
