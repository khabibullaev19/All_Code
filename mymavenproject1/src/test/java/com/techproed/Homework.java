package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
1. Create a class SignInHomework
2. Go to http://automationpractice.com/index.php
3. Click on sign in button
4.Send your email and click on create an account button
5.Verify the Text : CREATE AN ACCOUNT
6. Verify the Text : YOUR PERSONAL INFORMATION
7. Verify the Text : Title
8. Select your title
9. Enter your first name
10. Enter your last name
11. Enter your email
12. Enter your password
13. DO NOT ENTER DATE OF BIRTH-YOU DIDNT LEARN DROPDOWN YET
14. Click on Sign up for our newsletter!
15. Enter your first name
16. Enter your last lane
17. Enter your company
18. Enter your Address
19. Enter your City
20. DO NOT SELECT STATE-YOU DIDNT LEARN DROPDOWN YET
21. Enter Postal Code
22.DO NOT SELECT COUNTRY-
23. Enter additional information
24. Enter home phone
25. Enter mobile phone
26. Enter reference name
27. Click Register
28. Then verify the error message CONTAINS ‘error’
THEN YOU SHOULD SEE SOME ERROR MESSAGE. TAKE A SCREENSHOT MANUALLY AND SHARE WITH FROM CHAT
====
Be careful about putting some wait if needed

 */
public class Homework {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void signInBtn(){
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='login']"));
        signInButton.click();

        WebElement emailTBox = driver.findElement(By.id("email_create"));
        emailTBox.sendKeys("kjkjkjkk@gmail.com");

        WebElement createAccountBtn = driver.findElement(By.id("SubmitCreate"));
        createAccountBtn.click();


    }

}
