package stepsDefinition;


import enums.EBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import webPages.HomePage;

public class TestBase {
//    protected HomePage homePage;
//
//    protected WebDriver driver;
//
//    @Before
//    @Parameters("browser")
//    public void initialisation() {
//        if ("chrome".equalsIgnoreCase(EBrowser.CHROME.toString())) {
//            WebDriverManager.chromedriver().setup();
//        }
//        if ("firefox".equalsIgnoreCase(EBrowser.FIREFOX.toString())) {
//            WebDriverManager.firefoxdriver().setup();
//        }
//
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }
//
//    @After
//    public void quit() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}