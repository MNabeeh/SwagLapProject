package SwagLaps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckOutInfoTest extends BaseTest{

  @Test

    public void checkOutYourInformation (){
      LoginPage loginPage = new LoginPage(driver);
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

      CheckOutOverviewPage checkOutOverviewPage = new CheckOutOverviewPage(driver);


      boolean IsHeaderIsAvailable= driver.findElement(checkOutOverviewPage.getOverViewInfo()).isDisplayed();
        Assert.assertTrue(IsHeaderIsAvailable);









  }








}
