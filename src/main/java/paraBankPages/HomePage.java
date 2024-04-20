package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private By openNewAccount= By.xpath("//*[text()='Open New Account']");
    private  By payPills= By.xpath("//*[text()='Bill Pay']");
    private By transferFunds= By.xpath("//*[text()=\"Transfer Funds\"]");
    private  By applyLoan= By.xpath("//*[text()=\"Request Loan\"]");
    private  By updateContacts = By.xpath("//*[text()=\"Update Contact Info\"]");

        public NewAccountPage clickOnOpenNewAccount () {
        driver.findElement(openNewAccount).click();
        return new NewAccountPage(driver);

       }
        public TransferFundPage clickOnTransferFundsBTn () {

            driver.findElement(transferFunds).click();
            return new TransferFundPage(driver);
        }
        public PayPillsPage clickOnPayPills () {
            driver.findElement(payPills).click();
            return new PayPillsPage(driver);
        }
          public ApplyLoanPage clickOnApplyLoan () {
          driver.findElement(applyLoan).click();
          return new ApplyLoanPage(driver);
        }
      public  void upDateContactInfo(){
        driver.findElement(updateContacts).click();
      }



        }

