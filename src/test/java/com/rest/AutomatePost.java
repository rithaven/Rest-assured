package com.rest;

import org.testng.annotations.Test;

public class AutomatePost extends BaseTest {

    @Test
    public void createUser() {

        String body = "{ \"name\": \"Ritha\", \"job\": \"QA\" }";

        request
                .body(body)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);
    }
}