package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class BaseClass {

    WebDriver driver;
    public WebDriver DriverInetiation(){
        if(driver==null){
            ChromeOptions chromeOptions=new ChromeOptions();
            //chromeOptions.addArguments("disable-infobars");
            chromeOptions.setExperimentalOption("useAutomationExtension", false);
            chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            return driver=new ChromeDriver(chromeOptions);
        }else {
            return driver;
        }
    }

}
