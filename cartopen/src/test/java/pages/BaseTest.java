package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.nio.file.Files;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        // Automatically setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create temporary folder for Chrome profile
        String userDataDir = Files.createTempDirectory("chrome-user-data").toString();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=" + userDataDir);
        options.addArguments("--remote-allow-origins=*"); // needed for new Chrome versions

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
