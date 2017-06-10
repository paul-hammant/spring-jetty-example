package com.paulhammant.springantinteg;

import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class HWIntegrationTest {

    @Before
    public void beforeAll() throws Exception {
        new EmbeddedJetty().startJetty(8080);
    }

    @Test
    public void testSomething() throws InterruptedException {

        when()
            .get("/api/hello")
        .then()
            .statusCode(200)
            .body(equalTo("[\"hello\",\"world\"]"));
    }

}
