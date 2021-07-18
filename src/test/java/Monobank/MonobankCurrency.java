package Monobank;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class MonobankCurrency extends BaseMonobank {

    @Test
    public void getMonobankCurrency() {
        this.auth
                .given()
                .get("/bank/currency")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(("src/test/resources/mono/JSON_Schema_monobankCurrency.json"))))
                .log().all();
    }

}