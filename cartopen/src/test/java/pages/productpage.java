package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class productpage {
    WebDriver driver;
    WebDriverWait wait;

    By addToCartBtn = By.id("button-cart");
    By successMsg = By.cssSelector("div.alert.alert-success");

    public productpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for 10 seconds
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public String getSuccessMessage() {
        // Wait until the success alert is visible
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
        return message.getText();
    }
}
