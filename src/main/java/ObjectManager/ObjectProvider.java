package ObjectManager;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class ObjectProvider {

    LoginPage loginPage;
    public LoginPage LoginPageObject(WebDriver driver){

        if(loginPage==null){
            return loginPage=new LoginPage(driver);
        }else {

            return loginPage;
        }
    }
}
