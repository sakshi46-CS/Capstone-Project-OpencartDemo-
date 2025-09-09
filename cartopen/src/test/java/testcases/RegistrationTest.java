package testcases;

import pages.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerWithValidDetails() {
        System.out.println("==== Starting Test: Register with Valid Details ====");

        HomePage homePage = new HomePage(driver);
        System.out.println("Navigated to Home Page.");

        RegisterPage registerPage = homePage.navigateToRegister();
        System.out.println("Navigated to Register Page.");

        String email = "Sham" + System.currentTimeMillis() + "@gmail.com";
        System.out.println("Generated unique email: " + email);

        System.out.println("Filling registration form with valid details...");
        registerPage.fillRegistrationForm("Sham", "Doe", email, "sham123");

        System.out.println("Accepting privacy policy...");
        registerPage.acceptPrivacyPolicy();

        System.out.println("Submitting registration form...");
        registerPage.submitForm();

        String successMsg = registerPage.getSuccessMessage();
        System.out.println("Captured success message: " + successMsg);

        Assert.assertEquals(successMsg, "Your Account Has Been Created!");
        System.out.println("Assertion passed: Account created successfully.");

        System.out.println("==== Test Completed: Register with Valid Details ====\n");
    }

//    @Test
//    public void registerWithExistingEmail() {
//        System.out.println("==== Starting Test: Register with Existing Email ====");
//
//        HomePage homePage = new HomePage(driver);
//        System.out.println("Navigated to Home Page.");
//
//        RegisterPage registerPage = homePage.navigateToRegister();
//        System.out.println("Navigated to Register Page.");
//
//        String existingEmail = "existing@mail.com";
//        System.out.println("Using existing email: " + existingEmail);
//
//        System.out.println("Filling registration form with existing email...");
//        registerPage.fillRegistrationForm("John", "Doe", existingEmail, "Password123");
//
//        System.out.println("Accepting privacy policy...");
//        registerPage.acceptPrivacyPolicy();
//
//        System.out.println("Submitting registration form...");
//        registerPage.submitForm();
//
//        String errorMsg = registerPage.getErrorMessage();
//        System.out.println("Captured error message: " + errorMsg);
//
//        Assert.assertTrue(errorMsg.contains("Warning: E-Mail Address is already registered!"));
//        System.out.println("Assertion passed: Correct error message displayed.");
//
//        System.out.println("==== Test Completed: Register with Existing Email ====\n");
//    }
}
