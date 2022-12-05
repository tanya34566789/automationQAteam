package TestFromVlados.ApiTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkAvatarAndIdTest() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpec200());
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        List<String> avatars = users.stream().map(UserData::getAvatar).toList();
        List<String> ids = users.stream().map(x -> x.getId().toString()).toList();
        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    @Test
    public void succesRegTest() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpec200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        RegisterApi user = new RegisterApi("eve.holt@reqres.in", "pistol");
        SuccesReg succesReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccesReg.class);
        Assert.assertNotNull(succesReg.getId());
        Assert.assertNotNull(succesReg.getToken());
        Assert.assertEquals(id, succesReg.getId());
        Assert.assertEquals(token, succesReg.getToken());
    }

    @Test
    public void loginSuccesTest() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpecCode(200));
        String token = "QpwL5tke4Pnpja7X4";
        LoginApi user = new LoginApi("eve.holt@reqres.in", "cityslicka");
        LoginSucces loginSucces = given()
                .body(user)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().as(LoginSucces.class);
        Assert.assertEquals(token, loginSucces.getLoginToken());
    }

    @Test
    public void loginUnSucces() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpecCode(400));
        LoginApi user = new LoginApi("peter@klaven", "");
        LoginUnSucces loginUnSucces = given()
                .body(user)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().as(LoginUnSucces.class);
        Assert.assertEquals("Missing password", loginUnSucces.getError());
    }

    @Test
    public void failRegTest() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpecError400());
        RegisterApi user = new RegisterApi("sydney@life", "");
        FailReg failReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(FailReg.class);
        Assert.assertEquals("Missing password", failReg.getError());
    }

    @Test
    public void listForYears() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpec200());
        List<ColorsData> colors = given()
                .when()
                .get("api/unkown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);
        List<Integer> years = colors.stream().map(ColorsData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        System.out.println(years);
        System.out.println(sortedYears);
        Assert.assertEquals(sortedYears, years);
    }

    @Test
    public void deleteUser2() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpecCode(204));
        Response response = given()
                .when()
                .delete("api/users/2")
                .then().log().all().extract().response();
        Assert.assertEquals(response.statusCode(), 204);
        System.out.println(response.statusCode());
    }

    @Test
    public void timeTest2() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpec200());
        UserTime user = new UserTime("morpheus", "zion resident");
        Response response = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all().extract().response();
        JsonPath jsonPath = response.jsonPath();
        String q = jsonPath.get("updatedAt");
        String videl = "(.{8})$";
        String videl2 = "(.{14})$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(videl2, "");
        Assert.assertEquals(currentTime, q.replaceAll(videl, ""));
        System.out.println(currentTime);
        System.out.println(q.replaceAll(videl, ""));
    }

    @Test
    public void createUser() {
        Specification.InstallSpecification(Specification.requestSpecification(URL), Specification.responceSpecCode(201));
        CreateUser user = new CreateUser("morpheus", "leader");
        CreateUserData createUserData = given()
                .body(user)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(CreateUserData.class);
        Assert.assertEquals("673", createUserData.getId());
    }
}

