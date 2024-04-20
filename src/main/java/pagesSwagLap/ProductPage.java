package pagesSwagLap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage (WebDriver driver)
    {
        this.driver=driver;
    }


    private By ProductPrice = By.className("inventory_details_price");
    private By addElementToCart = By.xpath("//*[text()=\"Add to cart\"]");
    private By cartLink = By.xpath("//*[@class=\"shopping_cart_badge\"]");
    //By CartIcon = By.id("shopping_cart_container");
    public By getPriceLink(){
        return ProductPrice;
    }

    public ProductPage addElementToCart (){
        driver.findElement(addElementToCart).click();
        return this;
    }

    public CartPage clickOnCartLink (){
        driver.findElement(cartLink).click();
        return new CartPage(driver);
    }
}