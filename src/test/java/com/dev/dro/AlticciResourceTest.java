package com.dev.dro;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class AlticciResourceTest {

  @Test
  void getAlticciByIndex() {
    Integer index = 8;
    given()
        .pathParam("index", index)
        .when().get("/alticci/{index}")
        .then()
        .statusCode(200)
        .body(is("5"));
  }
}
