package BookmanagementAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Updating_Book_Details {
	@BeforeClass
    public void setup() {
        RestAssured.baseURI = "http://your-api-url";
    }

    @Test
    public void updateBookWithValidData() {
        String requestBody = "{ \"title\": \"Updated Book\", \"author\": \"Updated Author\", \"isbn\": \"123-4567890123\" }";
        
        Response response = 
            given()
                .contentType(JSON)
                .body(requestBody)
                .pathParam("bookId", 1)
            .when()
                .put("/books/{bookId}")
            .then()
                .statusCode(200)
                .extract().response();
        
        Assert.assertEquals(response.jsonPath().getString("message"), "Book updated successfully");
    }

    @Test
    public void updateBookWithInvalidData() {
        String requestBody = "{ \"title\": \"\", \"author\": \"\", \"isbn\": \"\" }";
        
        Response response = 
            given()
                .contentType(JSON)
                .body(requestBody)
                .pathParam("bookId", 1)
            .when()
                .put("/books/{bookId}")
            .then()
                .statusCode(400)
                .extract().response();
        
        Assert.assertEquals(response.jsonPath().getString("message"), "Invalid book data");
    }
}


