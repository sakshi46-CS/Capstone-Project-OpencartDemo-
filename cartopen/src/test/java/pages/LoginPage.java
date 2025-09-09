package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.cssSelector("input.btn.btn-primary");
    By myAccountTitle = By.xpath("//span[normalize-space()='My Account']");
    By errorMsg = By.cssSelector("div.alert.alert-danger");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

public String getMyAccountText() {
    return driver.findElement(myAccountTitle).getText();
}
    public void login(String mail, String pwd) {
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }

    public String getAccountTitle() {
        return driver.findElement(myAccountTitle).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }
}
