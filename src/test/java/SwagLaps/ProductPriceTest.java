package SwagLaps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagesSwagLap.CartPage;
import pagesSwagLap.HomePage;
import pagesSwagLap.LoginPage;
import pagesSwagLap.ProductPage;

public class ProductPriceTest  extends BaseTest{
    String expectedPrice= "$49.99";

    @Test

    public void product(){

       // By priceLink= By.className("inventory_details_price");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        HomePage homePage= new HomePage(driver);
        homePage.openProduct();

        ProductPage productPage= new ProductPage(driver);

        String actualValue = driver.findElement(productPage.getPriceLink()).getText();
        Assert.assertEquals(actualValue,expectedPrice);

    }
    @Test

    public void addProductToCart (){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        HomePage homePage= new HomePage(driver);
        homePage.openProduct();

        ProductPage productPage= new ProductPage(driver);
        productPage.addElementToCart();
        productPage.clickOnCartLink();

        CartPage cartPages= new CartPage(driver);
        boolean isElementIsDisplayed = driver.findElement(cartPages.getProductName()).isDisplayed();
        Assert.assertTrue(isElementIsDisplayed);


    }



}
