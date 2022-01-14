package techproedapi.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest08 {
    /*
                     Warm Up (13 Minutes)
        1). Create a class and name it as GetRequest08
        2). When
                I send a GET Request to https://jsonplaceholder.typicode.com/todos
            Then
                HTTP Status Code should be "200"
                And Content Type should be in "JSON" format
                And there should be 200 "title"
                And "dignissimos quo nobis earum saepe" should be one of the "title"s
                And 111, 121, and 131 should be among the "id"s
                And 4th title is "et porro tempora"
                And last title is "ipsam aperiam voluptates qui"
     */
    @Test
    public void get01(){
        Response response = given().
                            when().
                               get("https://jsonplaceholder.typicode.com/todos");

        response.prettyPrint();

        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("title", hasSize(200),
                        "title",hasItem("dignissimos quo nobis earum saepe"),
                        "id", hasItems(111, 121, 131),
                        "title[3]",equalTo("et porro tempora"),
                        "title[-1]",equalTo("ipsam aperiam voluptates qui"));
    }
}
