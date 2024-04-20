package pagesSwagLap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    private By productName= By.className("inventory_item_name");
    private By checkOutBtn= By.id("checkout");


    public By getProductName (){
        return productName;


    }
    public CheckOutInfoPage clickOnCheckOut(){
        driver.findElement(checkOutBtn).click();
        return new CheckOutInfoPage(driver);

    }

    /*private By RemoveAction= By.id("remove-sauce-labs-backpack");
    private By ContinueShopping= By.id("continue-shopping");
    private By CheckOut= By.className("btn btn_action btn_medium checkout_button ");


        public void cartAction1()
        {
            driver.findElement(RemoveAction).click();
            driver.findElement(ContinueShopping).click();
            driver.findElement(CheckOut).click();


        }

    public void cartAction2() {
        driver.findElement(ContinueShopping).click();
    }

    */
    }




