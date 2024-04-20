package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {

    private WebDriver driver;
     public NewAccountPage(WebDriver driver) {
         this.driver = driver;
     }

         private By OnOpenNewAccount2 = By.xpath("//input[@class=\"button\"]");
        public void OpenNewAccount2 ()
        {
            driver.findElement(OnOpenNewAccount2).click();
        }
}
