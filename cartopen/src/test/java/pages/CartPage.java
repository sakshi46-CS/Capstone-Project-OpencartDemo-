package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    By cartBtn = By.xpath("//span[text()='Shopping Cart']");
    By removeBtn = By.xpath("//button[@class='btn btn-danger']");
    By emptyCartMsg = By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
    }

    public void openCart() {
        driver.findElement(cartBtn).click();
    }

    public void removeProduct() {
        driver.findElement(removeBtn).click();
    }

    public String getEmptyCartMessage() {
        // Wait until the empty cart message is visible
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMsg));
        return message.getText();
    }
}
