package com.rest;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

public class ResponseSpecBuilderExample extends BaseTest {

    @Test
    public void builderExample() {

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