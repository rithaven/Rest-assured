package com.rest;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class Logging {
 @Test
 public void logExample() {
  RestAssured.given().log().all()
   .when().get("https://reqres.in/api/users?page=2")
   .then().log().all();
 }
}