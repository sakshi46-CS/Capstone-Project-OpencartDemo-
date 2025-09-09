package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;

    By productLink = By.xpath("//a[contains(text(),'iPhone')]");

    By noResultMsg = By.xpath("//p[text()='There is no product that matches the search criteria.']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductDisplayed() {
        return driver.findElement(productLink).isDisplayed();
    }

    public String getNoResultMessage() {
        return driver.findElement(noResultMsg).getText();
    }

    public productpage openProduct() {
        driver.findElement(productLink).click();
        return new productpage(driver);
    }
}
