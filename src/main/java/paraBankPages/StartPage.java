package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;

    }

    private By registerBtn = By.xpath("//*[text()=\"Register\"]");


    public void clickOnRegisterLink() {

        driver.findElement(registerBtn).click();
    }
}