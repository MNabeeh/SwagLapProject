package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   private WebDriver driver;

    public  LoginPage (WebDriver driver){
        this.driver=driver;
    }

    private  By username = By.xpath("//*[@name=\"username\"]");
    private  By password = By.xpath("//*[@name=\"password\"]");
    private By loginBtn= By.xpath("(//*[@class=\"button\"])[2]");

    public HomePage login (String UserName, String PassWord){
        driver.findElement(username).sendKeys(UserName);
        driver.findElement(password).sendKeys(PassWord);
        driver.findElement(loginBtn).click();

        return new HomePage(driver);
    }
}
