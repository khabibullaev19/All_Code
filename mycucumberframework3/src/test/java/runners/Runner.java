package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = ".html extension:target\\default-cucumber-reports",
        //Where is the path of the feature folder
        features = "src/test/resources/features",
        //Path of the stepdefinitions folder
        glue = "stepdefinitions",
        tags = "@scenario_outline",
        //publish = true,
        dryRun = false
)
public class Runner {
    //Runner class is to RUN the feature files.
    //This runner class is also used to configure and control the framework
}