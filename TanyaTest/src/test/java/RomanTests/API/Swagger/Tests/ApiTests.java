package RomanTests.API.Swagger.Tests;

import RomanTests.API.Swagger.Base.Base;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

import java.io.File;

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

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode root = mapper.readTree(new File("/Users/personal/Desktop/QA/automationQAteam/TanyaTest/src/test/java/RomanTests/API/Swagger/Tests/data.json"));
            // Use the data in root as needed in your code
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
