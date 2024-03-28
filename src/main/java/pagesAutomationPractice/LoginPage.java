package pagesAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By login = By.xpath("//*[@class='fa fa-lock']");
    By email = By.xpath("//input[@data-qa='login-email']");
    By passWord = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//*[@data-qa='login-button']");
    By errorSms= By.xpath("Your email or password is incorrect!");


    public  void Login (String username, String password)
    {
        driver.findElement(login).click();
        driver.findElement(email).sendKeys(username);
        driver.findElement(passWord).sendKeys(password);
        driver.findElement(loginButton).click();




    }





}
