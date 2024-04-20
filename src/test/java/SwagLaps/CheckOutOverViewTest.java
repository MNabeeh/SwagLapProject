package SwagLaps;

import org.testng.annotations.Test;
import pagesSwagLap.*;

public class CheckOutOverViewTest extends  BaseTest{
    @Test

    public void finishBtn() {

        new LoginPage(driver).login("standard_user", "secret_sauce")
                .openProduct()
                .addElementToCart()
                .addElementToCart().
                clickOnCartLink()
                .clickOnCheckOut()
                .checkOutLogin("Maha", "Nabeeh", "123")
                .clickOnFinishBtn();





        /*LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage= new HomePage(driver);
        homePage.openProduct();

        ProductPage productPage= new ProductPage(driver);
        productPage.addElementToCart();
        productPage.clickOnCartLink();

        CartPage cartPages= new CartPage(driver);
        cartPages.clickOnCheckOut();

        CheckOutInfoPage checkOutInfo= new CheckOutInfoPage(driver);
        checkOutInfo.checkOutLogin("Maha","Nabeeh","123");

        CheckOutOverviewPage checkOutOverviewPage= new CheckOutOverviewPage(driver);
        checkOutOverviewPage.clickOnFinishBtn();

        FinishPage finishPage= new FinishPage(driver);
        boolean IsFinishHeaderIsVisible= driver.findElement(finishPage.getFinishHeader()).isDisplayed();
        Assert.assertTrue(IsFinishHeaderIsVisible);


    }*/
    }
}
