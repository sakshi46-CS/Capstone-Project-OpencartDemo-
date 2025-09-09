package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By myAccount = By.xpath("//span[text()='My Account']");
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Login");
    By searchBox = By.name("search");
    By searchBtn = By.cssSelector("button.btn.btn-default.btn-lg");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage navigateToRegister() {
        driver.findElement(myAccount).click();
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }

    public LoginPage navigateToLogin() {
        driver.findElement(myAccount).click();
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }

    public SearchPage searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchBtn).click();
        return new SearchPage(driver);
    }
}
