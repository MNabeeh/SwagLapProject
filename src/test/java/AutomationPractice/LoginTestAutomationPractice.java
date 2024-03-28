package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTestAutomationPractice extends BaseTestAutomationPractice{
    WebDriver driver;

    By email = By.xpath("//*[@data-qa='login-email']");
    By password =By.xpath("//*[@data-qa='login-password']");

    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginButton =By.id("login-button");
    By header = By.id("header_container");
    By error= By.xpath("//*[@data-test='error']");

    //date are


}
