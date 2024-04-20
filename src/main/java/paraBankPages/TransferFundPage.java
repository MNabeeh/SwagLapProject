package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundPage {
     WebDriver driver;
    public TransferFundPage(WebDriver driver){
        this.driver= driver;
    }
    private By transferFund= By.id("amount");
    private  By TransferBtn= By.xpath("//*[@value=\"Transfer\"]");


    public void CreateTransferFund (String amount)
    {
        driver.findElement(transferFund).sendKeys( amount);
        driver.findElement(TransferBtn).click();
    }

}
