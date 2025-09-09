package testcases;

import pages.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class LoginTest extends BaseTest {

    @Test
    
    public void loginWithValidCredentials() {
        System.out.println("==== Starting Test: Login with Valid Credentials ====");

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.navigateToLogin();

        System.out.println("Entering valid credentials...");
        loginPage.login("john@mail.com", "Password123");

        String accountText = loginPage.getMyAccountText();
        System.out.println("Captured My Account Text: " + accountText);

        Assert.assertEquals(accountText, "My Account");
        System.out.println("Assertion passed: User successfully logged in.");

        System.out.println("==== Test Completed: Login with Valid Credentials ====\n");
    }

//    @Test
//    public void loginWithInvalidCredentials() {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = homePage.navigateToLogin();
//
//        loginPage.login("wrong@mail.com", "wrong123");
//
//        Assert.assertTrue(loginPage.getErrorMessage().contains("Warning: No match for E-Mail Address and/or Password."));
//    }
}
