package Privat;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class PrivatCurrencyOnline extends BasePrivat{
 @Test
    public void GetPrivatCurrencyOnline()  {
        this.auth
                .given()
                .get("/pubinfo?exchange&json&coursid=11")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(("src/test/resources/privat/JSON_Schema_PrivatCurrencyCash.json"))))
                .log().all(); }
}
