package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Class01 extends TestBase {

    @Test
    public void postReq(){
    Map<String,String> reqBody = new HashMap<>();
    reqBody.put("name","Tenali Ramakrishna");
    reqBody.put("gender","male");
    reqBody.put("email","tenali.ramakrishna@15ce.com");
    reqBody.put("status","status");

    spec01.pathParam("users","users");

//        HttpClient client = new DefaultHttpClient();
//        HttpGet request = new HttpGet("https://gorest.co.in/public/v1");
//        request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
//        client.execute();

        Response response = given().
                    contentType(ContentType.JSON).
                    auth().basic("","").
                spec(spec01).
                body(reqBody).post("/{users}");
        response.prettyPrint();

    /*
    curl -i -H "Accept:application/json" -H "Content-Type:application/json" -H
    "Authorization: Bearer ACCESS-TOKEN" -XPOST "https://gorest.co.in/public/v1/users" -d
    '{"name":"Tenali Ramakrishna", "gender":"male", "email":"tenali.ramakrishna@15ce.com", "status":"active"}'
     */
    }
}
