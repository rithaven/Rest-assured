package com.rest;

import org.testng.annotations.Test;

public class AutomatePut extends BaseTest {

    @Test
    public void updateUser() {

        String body = "{ \"name\": \"Ritha Updated\", \"job\": \"Senior QA\" }";

        request
                .body(body)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200);
    }
}