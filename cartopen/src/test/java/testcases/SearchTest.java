package testcases;

import pages.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTest extends BaseTest {

    @Test
    public void searchValidProduct() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchProduct("iPhone");

        Assert.assertTrue(searchPage.isProductDisplayed());
    }
   
    @Test
    public void searchInvalidProduct() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchProduct("NonExistentProduct");

        Assert.assertEquals(searchPage.getNoResultMessage(), "There is no product that matches the search criteria.");
    }
}
