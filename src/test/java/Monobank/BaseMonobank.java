package Monobank;

import config.Mainprop;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class BaseMonobank {
    String baseUrl = Mainprop.getProperty("monoBank");
    protected RequestSpecification auth;

    public BaseMonobank() {
        auth = given()
                .spec(
                        new RequestSpecBuilder()
                                .setBaseUri(this.baseUrl)
                                .build())
                .auth()
                .none();
    }
}
