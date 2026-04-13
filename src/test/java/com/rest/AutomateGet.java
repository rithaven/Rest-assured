//package com.rest;
//
//import org.testng.annotations.Test;
//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//public class AutomateGet extends BaseTest {
//
//    @Test
//    public void getUsers() {
//
//        given()
//                .header("x-api-key", API_KEY)
//                .when()
//                .get("/api/users?page=2")
//                .then()
//                .statusCode(200)
//                .body("page", equalTo(2));
//
//    }
//}
package com.rest;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class AutomateGet extends BaseTest {

    @Test
    public void getUsers() {

        request
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page", equalTo(2));
    }
}