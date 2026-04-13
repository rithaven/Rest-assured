package com.rest;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

public class ResponseSpecificationExample extends BaseTest {

    @Test
    public void responseSpec() {

        ResponseSpecification resSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

        request
                .when()
                .get("/api/users?page=2")
                .then()
                .spec(resSpec);
    }
}