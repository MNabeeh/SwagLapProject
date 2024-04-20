package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactInfoPage {

    private WebDriver driver;

    public  ContactInfoPage (WebDriver driver){
        this.driver= driver;
    }
    private By firstName = By.xpath("//*[@id=\"customer.firstName\"]");
    private By updateProfileBtn = By.xpath("//*[@class=\"button\"]");


    public  void updateProfile(String newName){
        driver.findElement(firstName).sendKeys(newName);
        driver.findElement(updateProfileBtn).click();
    }
}
