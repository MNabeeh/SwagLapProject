package orangePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By userNameField = By.xpath("//input[@name=\"username\"]");
    private By passWord=  By.xpath("//*[@name='password']");
    private  By loginBtn= By.xpath("//*[@type=\"submit\"]");


    public void loginTest (String userName , String SecondField){

        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passWord).sendKeys(SecondField);
        driver.findElement(loginBtn).click();


    }


}
