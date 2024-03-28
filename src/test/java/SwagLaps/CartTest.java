package SwagLaps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest{

    @Test
    public void cartTest (){
       LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage= new HomePage(driver);
        homePage.openProduct();

        ProductPage productPage= new ProductPage(driver);
        productPage.addElementToCart();
        productPage.clickOnCartLink();

        CartPage cartPages= new CartPage(driver);
        cartPages.clickOnCheckOut();

        CheckOutInfoPage checkOutInfoPage = new CheckOutInfoPage(driver);

        boolean isHeaderIsCorrect= driver.findElement(checkOutInfoPage.getHeaderInfo()).isDisplayed();
        Assert.assertTrue(isHeaderIsCorrect);



        //boolean isElementIsDisplayed =driver.findElement(cartPages.clickOnCheckOut()).isDisplayed();
        //Assert.assertTrue(isElementIsDisplayed);




    }
}
