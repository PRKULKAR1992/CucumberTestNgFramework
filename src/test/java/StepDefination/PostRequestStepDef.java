package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestStepDef {
    RequestSpecification requestSpecification;
    Response response;
    @Given("Load URL")
    public void load_url() {

        RestAssured.baseURI="https://reqres.in/";
        requestSpecification=RestAssured.given();
    }

    @And("Load body")
    public void load_body() {
        requestSpecification.log().all().body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
    }

    @When("Hit Request")
    public void hit_request() {
       response =requestSpecification.when().post("/api/users");
    }

    @Then("Verify the result")
    public void verify_the_result() {
        String responseInStringFormat=response.then().log().all().statusCode(201).extract().response().asString();
        JsonPath jsonPath=new JsonPath(responseInStringFormat);
        System.out.println(jsonPath.getString("id"));
    }
}
