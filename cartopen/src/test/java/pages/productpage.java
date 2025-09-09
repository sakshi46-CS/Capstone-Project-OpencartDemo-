package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage {
    WebDriver driver;

    By addToCartBtn = By.id("button-cart");
    By successMsg = By.cssSelector("div.alert.alert-success");

    public productpage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}
