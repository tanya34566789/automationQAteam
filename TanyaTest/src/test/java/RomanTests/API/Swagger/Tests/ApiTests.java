package RomanTests.API.Swagger.Tests;

import RomanTests.API.Swagger.Base.Base;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTests{
    private final static String URL = "http://localhost:8080/";

    @Test
    public void getArrOfObjects() {
        ResponseBody responseBody = given()
                .baseUri(URL)
                .header("Accept", "application/json")
                .when()
                .get("app/videogames")
                .getBody();
    }

}
