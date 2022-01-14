package com.techproed;
/*
    1. Create a class: Radio Button
    2. Create a main method and complete the following task
       1. Go to https://www.facebook.com/
       2. Click on Create an Account Button
       3. Locate the elements of radio buttons
       4. Then click on the radio buttons for your gender if they are not selected
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {

    //We create this class instance at the class level, because we can
    //reuse this class variable in the other test method.
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void btn() {
        WebElement createAccountBtn = driver.findElement(By.linkText("Create new account"));
        createAccountBtn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement maleBtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        maleBtn.click();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
