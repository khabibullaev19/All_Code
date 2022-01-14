package techproedapi.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import techproedapi.mains.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetRequest15 extends TestBase {
    //GSON

    @Test
    public void get01(){
        Response response = given().
                                spec(spec02).
                            when().
                                get();
        response.prettyPrint();

        List<Map<String,Object>> listOfMaps = response.as(ArrayList.class);
        System.out.println(listOfMaps);
    }
}
