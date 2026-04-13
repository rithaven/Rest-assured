package com.rest;

import org.testng.annotations.Test;

public class MethodChaining extends BaseTest {

    @Test
    public void chainingExample() {

        request
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);
    }
}