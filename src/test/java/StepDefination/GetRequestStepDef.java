package StepDefination;

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
    @Given("load the URL")
    public void load_the_url() {

        RestAssured.baseURI="https://reqres.in/";
        requestSpecification = RestAssured.given().log().all();
    }

    @When("Hit the URL")
    public void hit_the_url() {
        response =requestSpecification.when().get("/api/users?page=2");
    }

    @Then("get the response")
    public void get_the_response() {
        String extractedResponse = response.then().log().all().statusCode(200).extract().response().asString();
        JsonPath jsonPath=new JsonPath(extractedResponse);
        jsonPath.getString("");
    }
}
