package PageObjects;


import Utilities.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class LoginPage {
    WebDriver driver;
    Actions actions;
    private By UserId = By.xpath("//input[@class='email valid']");
    private By Password = By.xpath("//input[@class='password']");
    private By LoginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        actions=new Actions(driver);
    }

    public void Login(String userID, String password){
        actions.ClearTextBox(UserId);
        actions.SendText(UserId,userID);
        actions.ClearTextBox(Password);
        actions.SendText(Password,password);
        actions.CLickElement(LoginButton);
    }
}
