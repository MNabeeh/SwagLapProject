package pagesSwagLap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
     private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    //elements
    private By UserName = By.id("user-name");
    private By PassWord = By.id("password");
    private By loginButton =By.id("login-button");
    private By error= By.xpath("//*[@data-test='error']");

    public By getErrorSMS (){
        return error;
    }


    //actions
    public HomePage login(String username, String password)
    {

        driver.findElement(UserName).sendKeys(username);
        driver.findElement(PassWord).sendKeys (password);
        driver.findElement(loginButton).click();

        return new HomePage(driver);

    }


}
