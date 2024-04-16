package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions {
    WebDriver driver;
    WebDriverWait wait;

    public Actions(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void CLickElement(By providedElement){
        wait.until(ExpectedConditions.elementToBeClickable(providedElement));
        WebElement element=driver.findElement(providedElement);
        element.click();
    }

    public void ClearTextBox(By providedElement){
        wait.until(ExpectedConditions.visibilityOfElementLocated(providedElement));
        WebElement element=driver.findElement(providedElement);
        element.clear();
    }

    public void SendText(By providedElement,String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(providedElement));
        WebElement element=driver.findElement(providedElement);
        element.sendKeys(text);
    }
}
