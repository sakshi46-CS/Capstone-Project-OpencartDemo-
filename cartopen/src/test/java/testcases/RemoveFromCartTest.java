package testcases;

import pages.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void removeProductFromCart() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchProduct("iPhone");
        productpage productPage = searchPage.openProduct();

        productPage.addToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();
        cartPage.removeProduct();

        Assert.assertEquals(cartPage.getEmptyCartMessage(), "Your shopping cart is empty!");
    }
}
