package paraBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayPillsPage {

    WebDriver driver;
     public   PayPillsPage (WebDriver driver){
         this.driver= driver;
     }

      private By PayeeName = By.xpath("//*[@name= 'payee.name']");
      private By Address = By.xpath("//*[@name= 'payee.address.street']");
    private By City =By.xpath("//*[@name= 'payee.address.city']");
    private By State =By.xpath("//*[@name= 'payee.address.state']");
    private By ZipCode =By.xpath("//*[@name= 'payee.address.zipCode']");
    private By Phone  =By.xpath("//*[@name= 'payee.phoneNumber']");
    private By  Account  =By.xpath("//*[@name= 'payee.accountNumber']");
    private By VerifyAccount  =By.xpath("//*[@name= 'verifyAccount']");
    private By  Amount  =By.xpath("//*[@name= 'amount']");

    private By  SendPayment=By.xpath("//*[@value= 'Send Payment']");



    public  void submitPayPill (String Name, String address, String city, String state, String zipCode, String phone, String account, String verifyAccount, String amount){

        driver.findElement(PayeeName).sendKeys(Name);
        driver.findElement(Address).sendKeys(address);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(state);
        driver.findElement(ZipCode).sendKeys(zipCode);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(Account).sendKeys(account);
        driver.findElement(VerifyAccount).sendKeys(verifyAccount);
        driver.findElement(Amount).sendKeys(amount);
        driver.findElement(SendPayment).click();



    }




}
