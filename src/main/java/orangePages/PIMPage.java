package orangePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {

    WebDriver driver;
    public  PIMPage (WebDriver driver){
        this.driver= driver;
    }

       private  By employeeID = By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]");
       private By searchBtn= By.xpath("//*[@type='submit']");


       public void searchEmployee (String Id) {

           driver.findElement(employeeID).sendKeys(Id);


       }
       public void clickOnSearchBtn(){
           driver.findElement(searchBtn).click();
       }

}
