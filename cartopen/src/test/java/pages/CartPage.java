package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By cartBtn = By.xpath("//span[text()='Shopping Cart']");
    By removeBtn = By.xpath("//button[@class='btn btn-danger']");
    By emptyCartMsg = By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]"
);

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(cartBtn).click();
    }

    public void removeProduct() {
        driver.findElement(removeBtn).click();
    }

    public String getEmptyCartMessage() {
        return driver.findElement(emptyCartMsg).getText();
    }
}
