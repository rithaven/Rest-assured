//package com.rest;
//
//import org.testng.annotations.Test;
//
//import static io.restassured.RestAssured.*;
//
//public class AutomateDelete extends BaseTest {
//
//    @Test
//    public void deleteUser() {
//
//        given()
//                .header("x-api-key", API_KEY)
//                .when()
//                .delete("/api/users/2")
//                .then()
//                .statusCode(204);
//
//    }
//}
package com.rest;

import org.testng.annotations.Test;

public class AutomateDelete extends BaseTest {

    @Test
    public void deleteUser() {

        request
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }
}