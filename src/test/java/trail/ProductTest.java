package trail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    String prodcutName= "Sauce Labs Fleece Jacket";
    //elements Are
    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginButton =By.id("login-button");
    By productLink=By.xpath("//*[text()='"+prodcutName+"']");
    By priceLink= By.className("inventory_details_price");

    String validUsername ="standard_user";
    String validPassword= "secret_sauce";
    String priceName= "$49.99";
    String expectedPrice = priceName;

    @Test
    public void validateProductPrice()
    {
        driver.findElement(userName).sendKeys(validUsername);
        driver.findElement(passWord).sendKeys (validPassword);
        driver.findElement(loginButton).click();
        driver.findElement(productLink).click();
        String actualValue = driver.findElement(priceLink).getText();
        Assert.assertEquals(actualValue,expectedPrice);
    }
}
