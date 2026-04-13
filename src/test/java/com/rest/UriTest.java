package com.rest;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class UriTest {

    @Test
    public void uriExample() {

        RestAssured.baseURI = "https://reqres.in";

        RestAssured
                .given()
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);
    }
}