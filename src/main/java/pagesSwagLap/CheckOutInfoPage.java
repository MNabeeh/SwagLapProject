package pagesSwagLap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInfoPage {
    private WebDriver driver;

    public CheckOutInfoPage(WebDriver driver){
        this.driver= driver;
    }


    private By validateCheckOut= By.xpath("//*[text()=\"Checkout: Your Information\"]");

    private By firstname= By.id("first-name");
    private By lastname= By.id("last-name");
    private By codigoPostal= By.id("postal-code");
    private  By continueBtn= By.id("continue");

    private By headerInfo= By.xpath("//*[text()=\"Checkout: Your Information\"]");



    public By getHeaderInfo (){
        return headerInfo;
    }

    public CheckOutOverviewPage checkOutLogin (String FirstName, String LastName, String CodePostel){

        driver.findElement(firstname).sendKeys(FirstName);
        driver.findElement(lastname).sendKeys(LastName);
        driver.findElement(codigoPostal).sendKeys(CodePostel);
        driver.findElement(continueBtn).click();

        return new CheckOutOverviewPage(driver);




    }




}
