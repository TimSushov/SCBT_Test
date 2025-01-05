package task1.steps;


import io.restassured.response.Response;
import task1.RequestSpec;
import task1.Urls;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class ChangeUrlSteps extends RequestSpec {

    public void changeUrlSteps(int statusCode, String longUrl) {
        Response response =
                given()
                        .spec(requestSpec())
                        .header("Content-type", "application/x-www-form-urlencoded")
                        .and()
                        .formParam("url", longUrl)
                        .when()
                        .post(Urls.SHORT_URL_GET);
        if (statusCode == 200) {
            response.then().assertThat().statusCode(statusCode).and().assertThat().body("result_url", notNullValue());
        } else if (statusCode == 400) {
            response.then().assertThat().statusCode(statusCode).and().assertThat().body("error", notNullValue());
        }
    }
}
