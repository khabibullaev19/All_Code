package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected RequestSpecification spec01;
    @BeforeMethod
    public void setUp(){

            spec01 = new RequestSpecBuilder().
                    setBaseUri("https://gorest.co.in/public/v1").
                    build();
        }
    }

