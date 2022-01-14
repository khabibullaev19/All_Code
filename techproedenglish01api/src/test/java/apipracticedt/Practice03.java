package apipracticedt;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproedapi.mains.Data;
import techproedapi.mains.PojoPractice03;
import techproedapi.mains.TestBase;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class Practice03 extends TestBase {
    /*
       When
           I send a GET Request to REST API URL
           http://dummy.restapiexample.com/api/v1/employee/3
       Then
           HTTP Status Code should be 200
           And Response format should be "application/json"
           And "employee_name" should be "Ashton Cox"
           And "employee_salary" should be 86000
           And "employee_age" should be 66
           And "status" should be "success"
           And "message" should be "Successfully! Record has been fetched."

           NOTE: For Base URL use spec04
           NOTE: For actual data use JsonPath
           NOTE: For expected data use JSONObject
           NOTE: Use Hard Assertion and Soft Assertion
     */

    @Test
    public void getPractice(){
        // 1.Step: Set Endpoint by using pathParam() or queryParam()
        spec04.pathParams("employee","employee",
                "id",3);

        // 2.Step: Store expected data by using Pojo
        Data data = new Data(3,"Ashton Cox",86000,66,"");
        PojoPractice03 expectedData = new PojoPractice03("success", data, "Successfully! Record has been fetched.");

        // 3.Step: Send GET Request to the Endpoint
        Response response = given().
                            contentType(ContentType.JSON).
                               spec(spec04).
                            when().
                               get("/{employee}/{id}");
        response.prettyPrint();

        // 4.Step: Hard Assertion by using body()
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("data.employee_name", equalTo(data.getEmployeeName()),
                        "data.employee_salary",equalTo(data.getEmployeeSalary()),
                        "data.employee_age",equalTo(data.getEmployeeAge()),
                        "status",equalTo(expectedData.getStatus()),
                        "message",equalTo(expectedData.getMessage()));

        // 5.Step: Hard Assertion by using assertEquals(), assertTrue(), assertFalse()
        JsonPath json = response.jsonPath();

        assertEquals(data.getEmployeeName(),json.getString("data.employee_name"));
        assertEquals(data.getEmployeeSalary(),json.get("data.employee_salary"));
        assertEquals(data.getEmployeeAge(),json.get("data.employee_age"));
        assertEquals(expectedData.getStatus(),json.getString("status"));
        assertEquals(expectedData.getMessage(),json.getString("message"));

        // 6.Step: Soft Assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(json.getString("data.employee_name"),data.getEmployeeName());
        softAssert.assertEquals(json.get("data.employee_salary"),data.getEmployeeSalary());
        softAssert.assertEquals(json.get("data.employee_age"),data.getEmployeeAge());
        softAssert.assertEquals(json.get("status"),expectedData.getStatus());
        softAssert.assertEquals(json.get("message"),expectedData.getMessage());

        softAssert.assertAll();
    }

}
