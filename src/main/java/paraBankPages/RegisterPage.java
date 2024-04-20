package paraBankPages;

import org.openqa.selenium.BuildInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;

    }

    private By firstNameField= By.xpath("//*[@id='customer.firstName']");
    private By lastNameField= By.xpath("//*[@id='customer.lastName']");
    private  By addressField= By.xpath("//*[@id='customer.address.street']");
    private By cityField= By.xpath("//*[@id='customer.address.city']");
    private By stateField = By.xpath("//*[@id='customer.address.state']");
    private  By zipCodeField= By.xpath("//*[@id='customer.address.zipCode']");
    private  By phoneField= By.xpath("//*[@id='customer.phoneNumber']");
    private  By ssnField= By.xpath("//*[@id='customer.ssn']");
    private  By usernameField= By.xpath("//*[@id='customer.username']");
    private  By passwordField= By.xpath("//*[@id='customer.password']");
    private  By confirmField= By.xpath("//*[@id='repeatedPassword']");
    private  By register= By.xpath("//*[@type='submit']");

    public void registerToTheSite(String Firstname,String Lastname, String Address,String CityName, String State,String ZipCode, String PhoneNumber, String Ssn, String Username, String Password, String ConfrimPassword){
        driver.findElement(firstNameField).sendKeys(Firstname);
        driver.findElement(lastNameField).sendKeys(Lastname);
        driver.findElement(addressField).sendKeys(Address);
        driver.findElement(cityField).sendKeys(CityName);
        driver.findElement(stateField).sendKeys(State);
        driver.findElement(zipCodeField).sendKeys(ZipCode);
        driver.findElement(phoneField).sendKeys(PhoneNumber);
        driver.findElement(ssnField).sendKeys(Ssn);
        driver.findElement(usernameField).sendKeys(Username);
        driver.findElement(passwordField).sendKeys(Password);
        driver.findElement(confirmField).sendKeys(ConfrimPassword);
        driver.findElement(register).click();





    }






}
