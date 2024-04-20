package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyLoanPage {
    private WebDriver driver;

    public  ApplyLoanPage (WebDriver driver){
        this.driver= driver;
    }
    private By loanAmount= By.xpath("//*[@id=\"amount\"]");
    private By downAmount  = By.xpath("//*[@id=\"downPayment\"]");

    private  By applyLoanBtn= By.xpath("//*[@value=\"Apply Now\"]");


    public  void ApplyLoan(String LoanAmount,String DownAmount){
        driver.findElement(loanAmount).sendKeys(LoanAmount);
        driver.findElement(downAmount).sendKeys(DownAmount);
        driver.findElement(applyLoanBtn).click();

    }
}
