package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethods {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //Putting Implicit Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Maximazing window
        driver.manage().window().maximize();
    }

    @Test
    public void titleTest(){
        //Verify if Google title = "Google"
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Title: " + actualTitle);
            System.out.println("Expected Title: " + expectedTitle);
        }

    }

    @Test
    public void imageTest(){
        //Verify if Google image is displayed or not
        WebElement image = driver.findElement(By.className("lnXdpd"));
        if (image.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }

    @Test
    public void gmailLinkText(){
        //Verify if the gmail link is displayed or not
        WebElement gmailLinkText = driver.findElement(By.linkText("Gmail"));
        if (gmailLinkText.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }

    @After
    public void tearDown(){
        // I am closing the driver after each test case
        driver.close();
    }

}
