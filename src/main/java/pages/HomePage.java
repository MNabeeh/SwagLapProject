package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //elements
   private String productName= "Sauce Labs Fleece Jacket";
    private By header = By.id("header_container");

    public By getHeader (){
        return header;
    }
    By productLink=By.xpath("//*[text()='"+productName+"']");

    //actions
    public void openProduct()
    {
        driver.findElement(productLink).click();
    }




}
