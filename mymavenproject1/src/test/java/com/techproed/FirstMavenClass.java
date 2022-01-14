package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        // Step 1: Create WebDriver manager
        WebDriverManager.chromedriver().setup();

        // Step 2: Create ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 3: Go to the webpage that you want
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        // Search for a random name

        // How can we get fake data with maven?
        // We have Java faker to get some fake data.
        Faker faker = new Faker();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(faker.name().fullName()+ Keys.ENTER);
        //searchBox.sendKeys(faker.address().cityName()+ Keys.ENTER);
        // And check how many results are there?

    }
}
