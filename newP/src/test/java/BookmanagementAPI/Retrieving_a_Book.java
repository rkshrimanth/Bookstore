package BookmanagementAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Retrieving_a_Book {
	@BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://your-api-url";
    }

    @Test
    public void retrieveBookWithValidId() {
        Response response = 
            given()
                .pathParam("bookId", 1)
            .when()
                .get("/books/{bookId}")
            .then()
                .statusCode(200)
                .extract().response();
        
        Assert.assertEquals(response.jsonPath().getString("title"), "Valid Book");
    }

    @Test
    public void retrieveBookWithInvalidId() {
        Response response = 
            given()
                .pathParam("bookId", 999)
            .when()
                .get("/books/{bookId}")
            .then()
                .statusCode(404)
                .extract().response();
        
        Assert.assertEquals(response.jsonPath().getString("message"), "Book not found");
    }
}

