package com.rest;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification request;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = "https://reqres.in";

        request = RestAssured.given()
                .header("x-api-key", "pub_40091ac67b6f7ec557e0818ef5cdd8a80092f8713126abb270416be15745df97")
                .header("Content-Type", "application/json");
    }
}