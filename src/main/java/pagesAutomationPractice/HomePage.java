package pagesAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;


    String productName ="Blue Top";

    By header = By.xpath("//*[@class='logo pull-left']");
    By productsLink=By.xpath("//*[@src='/get_product_picture/4']");

    //actions
    public void openProduct()
    {
        driver.findElement(productsLink).click();
    }

//*[text()='/products']

}
