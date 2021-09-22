package DevSavant;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class WorldTimeApi {
    @Test
    public void validate_status_code_200_timezone_endpoint() {

        String endpoint = "http://worldtimeapi.org/api/timezone";
        var response = given().when().get(endpoint).then()
                .assertThat()
                .statusCode(200)
                .header("Content-Type", equalTo("application/json; charset=utf-8"))
                .body(containsString("Africa"))
                .body(containsString("America"))
                .body(containsString("Antarctica"))
                .body(containsString("Asia"))
                .body(containsString("Etc"));
        response.log().all();

    }

    @Test
    public void validate_status_code_200_bogota_positive_test() {

        String endpoint = "http://worldtimeapi.org/api/timezone/America/Bogota";
        var response = given().when().when().get(endpoint).then().assertThat().statusCode(200)
                .body("size()", greaterThan(0)).
                body("datetime", notNullValue()).
                body("timezone", equalTo("America/Bogota"));

        response.log().body();


    }

    @Test
    public void validate_status_code_404_bogota_negative_test() {

        String endpoint = "http://worldtimeapi.org/api/timezone/Bogota";
        var response = given().when().when().get(endpoint).then().assertThat().statusCode(404);

        response.log().body();


    }


}
