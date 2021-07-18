package Privat;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
public class PrivatCurrencyCash extends BasePrivat {
 @Test
    public void GetPrivatCurrencyCash()  {
       this.auth
                .given()
                .get("/pubinfo?json&exchange&coursid=5")
                .then()
                .statusCode(200)
               .body(matchesJsonSchema(new File(("src/test/resources/privat/JSON_Schema_PrivatCurrencyCash.json"))))
               .log().all(); }
}
