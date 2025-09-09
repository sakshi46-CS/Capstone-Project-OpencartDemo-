package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCart() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchProduct("iPhone");
        productpage productPage = searchPage.openProduct();

        productPage.addToCart();

        Assert.assertTrue(productPage.getSuccessMessage().contains("Success: You have added iPhone to your shopping cart!"));
    }
}
