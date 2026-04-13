package com.rest;

import org.testng.annotations.Test;

import java.util.*;

public class RequestPayloadComplexJson extends BaseTest {

    @Test
    public void complexJson() {

        List<Integer> idArrayList = new ArrayList<>();
        idArrayList.add(5);
        idArrayList.add(9);

        Map<String, Object> batter1 = new HashMap<>();
        batter1.put("id", "1001");
        batter1.put("type", "Regular");

        Map<String, Object> batter2 = new HashMap<>();
        batter2.put("id", idArrayList);
        batter2.put("type", "Chocolate");

        List<Map<String, Object>> batterList = new ArrayList<>();
        batterList.add(batter1);
        batterList.add(batter2);

        Map<String, Object> finalBody = new HashMap<>();
        finalBody.put("batter", batterList);

        request
                .body(finalBody)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);
    }
}