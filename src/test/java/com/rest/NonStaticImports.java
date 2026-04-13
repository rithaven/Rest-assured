package com.rest;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class NonStaticImports extends BaseTest {

    @Test
    public void example() {

        RestAssured
                .given()
                .spec(request)
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);
    }
}