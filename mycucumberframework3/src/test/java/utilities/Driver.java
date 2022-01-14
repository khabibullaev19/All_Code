package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){
        // We do not create an instance/object.
    }

    //Create static driver instance
    //static because it can be used globally.
    // private is to call this sentence only in this class
    private static WebDriver driver;

    //Create a public static method to instantiate the driver
    public static WebDriver getDriver(){
        // I want to instantiate the driver instance
        // if driver is not pointing anywhere
        // If the driver is already pointing somewhere(being used)
        // We want to have only one driver
        if (driver==null){
            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver(){
        // Close the driver if it is not null
        // It means driver is pointing chrome(is being used)
        if (driver!=null) {
            driver.quit();
            //driver is pointing the chrome driver is not null
            driver=null;
        }
    }
}
