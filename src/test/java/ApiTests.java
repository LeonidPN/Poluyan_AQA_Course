import io.restassured.http.ContentType;
import org.apache.hc.core5.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTests {
    @ParameterizedTest
    @DisplayName("GET Request Test")
    @CsvSource({"'1', '2'", "'bar1', 'bar2'"})
    public void getRequestTest(String val1, String val2) {
        Map<String, String> res = given()
                .when()
                .contentType(ContentType.JSON)
                .get("https://postman-echo.com/get?foo1=" + val1 + "&foo2=" + val2)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .body()
                .jsonPath()
                .getMap("args");
        Assertions.assertEquals(val1, res.get("foo1"));
        Assertions.assertEquals(val2, res.get("foo2"));
    }

    @ParameterizedTest
    @DisplayName("POST Raw Text Test")
    @ValueSource(strings = {"{\n\t\"test\": \"value\"\n}"})
    public void postRawTextTest(String val) {
        String res = given()
                .when()
                .contentType(ContentType.TEXT)
                .body(val)
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .body()
                .jsonPath()
                .getString("data");
        Assertions.assertEquals(val, res);
    }

    @ParameterizedTest
    @DisplayName("POST Form Data Test")
    @CsvSource({"'1', '2'", "'bar1', 'bar2'"})
    public void postFormDataTest(String val1, String val2) {
        given()
                .when()
                .multiPart("foo1", val1)
                .multiPart("foo2", val2)
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and().body("form.foo1", equalTo(val1))
                .and().body("form.foo2", equalTo(val2));
    }

    @ParameterizedTest
    @DisplayName("PUT Request Test")
    @CsvSource({"This is expected to be sent back as part of response body.", "Test1234"})
    public void putRequestTest(String val) {
        String res = given()
                .when()
                .contentType(ContentType.TEXT)
                .body(val)
                .put("https://postman-echo.com/put")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .body()
                .jsonPath()
                .getString("data");
        Assertions.assertEquals(val, res);
    }

    @ParameterizedTest
    @DisplayName("PATCH Request Test")
    @CsvSource({"This is expected to be sent back as part of response body.", "Test1234"})
    public void patchRequestTest(String val) {
        given()
                .when()
                .contentType(ContentType.TEXT)
                .body(val)
                .patch("https://postman-echo.com/patch")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and().body("data", equalTo(val));
    }

    @ParameterizedTest
    @DisplayName("DELETE Request Test")
    @CsvSource({"This is expected to be sent back as part of response body.", "Test1234"})
    public void deleteRequestTest(String val) {
        given()
                .when()
                .contentType(ContentType.TEXT)
                .body(val)
                .delete("https://postman-echo.com/delete")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .and().body("data", equalTo(val));
    }
}
