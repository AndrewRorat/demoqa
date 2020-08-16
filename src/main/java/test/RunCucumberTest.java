package test;

import enums.EBrowser;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Parameters;

@CucumberOptions(features = {"src/main/resources/features"},
        glue = "stepsDefinition",
        plugin = {"pretty", "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Before
    @Parameters("browser")
    public void initialisation() {
        if ("chrome".equalsIgnoreCase(EBrowser.CHROME.toString())) {
            WebDriverManager.chromedriver().setup();
        }
        if ("firefox".equalsIgnoreCase(EBrowser.FIREFOX.toString())) {
            WebDriverManager.firefoxdriver().setup();
        }
    }
}