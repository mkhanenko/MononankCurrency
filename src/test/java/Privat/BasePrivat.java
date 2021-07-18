package Privat;


import config.Mainprop;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BasePrivat {

    String baseUrl = Mainprop.getProperty("privatBank");

    protected RequestSpecification auth;

    public BasePrivat() {
        auth = given()
                .spec(
                        new RequestSpecBuilder()
                                .setBaseUri(this.baseUrl)
                                .build())
                .auth()
                .none();
    }
}

