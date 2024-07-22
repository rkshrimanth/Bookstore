package BookmanagementAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Deleting_a_Book {
	@BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://your-api-url";
    }

    @Test
    public void deleteBookWithValidId() {
        Response response = 
            given()
                .pathParam("bookId", 1)
            .when()
                .delete("/books/{bookId}")
            .then()
                .statusCode(200)
                .extract().response();
        
        Assert.assertEquals(response.jsonPath().getString("message"), "Book deleted successfully");
    }

    @Test
    public void deleteBookWithInvalidId() {
        Response response = 
            given()
                .pathParam("bookId", 999)
            .when()
                .delete("/books/{bookId}")
            .then()
                .statusCode(404)
                .extract().response();
        
        Assert.assertEquals(response.jsonPath().getString("message"), "Book not found");
    }
}


