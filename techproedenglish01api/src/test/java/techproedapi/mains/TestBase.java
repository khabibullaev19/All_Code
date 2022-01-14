package techproedapi.mains;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected RequestSpecification spec01;
    protected RequestSpecification spec02;
    protected RequestSpecification spec03;
    protected RequestSpecification spec04;
    protected RequestSpecification spec05;
    protected RequestSpecification spec06;

    @BeforeMethod
    public void setUp01(){
        spec01 = new RequestSpecBuilder().
                     setBaseUri("https://jsonplaceholder.typicode.com/todos").
                     build();
    }

    @BeforeMethod
    public void setUp02(){
        spec02 = new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com/booking").
                build();
    }

    @BeforeMethod
    public void setUp03(){
        spec03 = new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
                build();
    }

    @BeforeMethod
    public void setUp04(){
        spec04 = new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1").
                build();
    }

    @BeforeMethod
    public void setUp05(){
        spec05 = new RequestSpecBuilder().
                setBaseUri("http://api.openweathermap.org").
                build();
    }

    @BeforeMethod
    public void setUp06(){
        spec06 = new RequestSpecBuilder().
                setBaseUri("http://api.agromonitoring.com").
                build();
    }
}
