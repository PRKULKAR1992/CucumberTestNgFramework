package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestStepDef {
    RequestSpecification requestSpecification;
    Response response;
    @Given("Load URL for getting single user")
    public void load_url_for_getting_single_user() {

        RestAssured.baseURI="https://reqres.in/";
        requestSpecification=RestAssured.given()
                .log().all();
    }

    @And("add path parameter")
    public void add_path_parameter() {
        requestSpecification.pathParam("id","2");
    }

    @When("hit request")
    public void hit_request() {
       response =requestSpecification.when().get("/api/users/{id}");
    }

    @Then("verify response")
    public void verify_response() {
       String R =response.then().log().all()
               .statusCode(200).extract().response().asString();
        JsonPath jsonPath=new JsonPath(R);
        System.out.println(jsonPath.getString("data.id"));
    }

    @Given("load the URL")
    public void load_the_url() {

        RestAssured.baseURI="https://reqres.in/";
        requestSpecification=RestAssured.given().log().all().queryParam("page","2");
    }

    @When("Hit the URL")
    public void hit_the_url() {
        response=requestSpecification.when().get("/api/users");
    }

    @Then("get the response")
    public void get_the_response() {
       String R= response.then().log().all().extract().response().asString();
       System.out.println(R);
    }
}
