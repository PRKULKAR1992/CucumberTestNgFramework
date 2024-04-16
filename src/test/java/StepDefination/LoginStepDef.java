package StepDefination;

import ObjectManager.ObjectProvider;
import PageObjects.LoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef extends BaseClass {
    WebDriver driver;
    @Given("Launch browser & open portal")
    public void launch_browser_open_portal() {
        this.driver=DriverInetiation();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/");
    }

    @When("Enter user Id as {string} & password as {string}")
    public void enter_user_id_password(String userID, String password) {

        ObjectProvider objectProvider =new ObjectProvider();
        LoginPage loginPageObject=objectProvider.LoginPageObject(driver);
        loginPageObject.Login(userID,password);
    }

    @And("Click on Login button")
    public void click_on_login_button() {

    }

    @Then("User should get redirected to home page")
    public void user_should_get_redirected_to_home_page() {

    }
}
