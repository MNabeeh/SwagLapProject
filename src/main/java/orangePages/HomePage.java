package orangePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver= driver;
    }
    private By Banner = By.xpath("//*[@class=\"oxd-topbar-header-title\"]");

    public By getBanner (){
        return Banner;
    }

    private By searchField = By.xpath("//input[@placeholder=\"Search\"]");

    private By pimBtn = By.xpath("//a[@class='oxd-main-menu-item']");





    public void searchTap (){
        driver.findElement(searchField).sendKeys("PIM");
    }
    public void clickPim(){

        driver.findElement(pimBtn).click();
    }
}
