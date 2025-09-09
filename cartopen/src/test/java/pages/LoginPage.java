package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.cssSelector("input.btn.btn-primary");
    By myAccountTitle = By.xpath("//span[normalize-space()='My Account']");
    By errorMsg = By.cssSelector("div.alert.alert-danger");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 sec wait
    }

    public void login(String mail, String pwd) {
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }

    public String getMyAccountText() {
        WebElement accountText = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountTitle));
        return accountText.getText();
    }

    public String getAccountTitle() {
        WebElement accountTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountTitle));
        return accountTitle.getText();
    }

    public String getErrorMessage() {
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        return error.getText();
    }
}
