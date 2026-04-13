package com.rest;

import org.testng.annotations.Test;

public class AutomateHeaders extends BaseTest {

    @Test
    public void headersExample() {

        request
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200);
    }
}