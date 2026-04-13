package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class StaticImports extends BaseTest {

    @Test
    public void example() {

        given()
                .spec(request)
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);
    }
}