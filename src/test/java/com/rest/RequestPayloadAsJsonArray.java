package com.rest;

import org.testng.annotations.Test;

import java.util.*;

public class RequestPayloadAsJsonArray extends BaseTest {

    @Test
    public void jsonArray() {

        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("API");

        request
                .body(skills)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);
    }
}