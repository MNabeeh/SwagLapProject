package trail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    //elements Are
    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginButton =By.id("login-button");
    By header = By.id("header_container");
    By error= By.xpath("//*[@data-test='error']");

    //date are
    String validUsername ="standard_user";
    String InValidUsername ="ssw";
    String validPassword= "secret_sauce";
    String InValidPassword= "432";

    @Test
    public void validLogin ()
    {
        driver.findElement(userName).sendKeys(validUsername);
        driver.findElement(passWord).sendKeys (validPassword);
        driver.findElement(loginButton).click();
        boolean isHeaderIsDisplayed = driver.findElement(header).isDisplayed();
        Assert.assertTrue(isHeaderIsDisplayed);
    }
    @Test
    public void InvalidLogin ()
    {
        driver.findElement(userName).sendKeys(InValidUsername);
        driver.findElement(passWord).sendKeys (InValidPassword);
        driver.findElement(loginButton).click();
        boolean IsErrorVisible= driver.findElement(error).isDisplayed();
        Assert.assertTrue(IsErrorVisible);

    }








}
