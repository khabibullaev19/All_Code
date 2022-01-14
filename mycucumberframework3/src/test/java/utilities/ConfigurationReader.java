package utilities;

/*
   Create Project: File->New->Project->Select Maven->click next
   Name: mycucumberframework3: finish->click on EnableAutoImport->
   Add Dependencies: Selenium Java, webdrivermanager,cucumber java, cucumber junit
   Right click on java and create the following packages
         1. pages(page objects goes here)
         2. runners(to run and control test cases)
         3. stepdefinitions(java codes goes here)
         4. utilities(reusable support classes goes here)
   In utilities package, create classes: Driver, ConfigReader
   Right-click on the projects and create configuration.properties file
   Right-click on test and create a new directory: resources
   Right-click on the resources and create a new directory: features(non java staff will go here)
   Right-click on the features->new->file->firstfeaturefile.feature
   Add cucumber plugin to work with IntelliJ IDE
       1. IntelliJ IDE-> Preferences-> Plugins-> Marketplace-> Type Cucumber for Java-> Install-> Restart
 */

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        // Path of the configuration.properties file
        String path = "configuration.properties";
        try {
            // Opening the configuration.properties file
            FileInputStream fileInputStream = new FileInputStream(path);
            // loading and reading the file
            properties = new Properties();
            properties.load(fileInputStream);
            // closing the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Create a method to READ
    // This method will get the KEY and return the VALUE
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
