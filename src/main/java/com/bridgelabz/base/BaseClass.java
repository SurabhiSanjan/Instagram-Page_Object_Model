package com.bridgelabz.base;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass {
    public WebDriver driver;
    public static Logger log;

    public void setUp() {
        log = Logger.getLogger(BaseClass.class.getName());
        PropertyConfigurator.configure("C:\\Users\\atulk\\IdeaProjects\\POM-Instagram\\log4j.properties");
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        log.info("Chrome Browser has been launched");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //log.debug("Implicit Time Wait");
    }

    public void closeBrowser() {
        driver.quit();
        log.info("Quit");
    }

}


