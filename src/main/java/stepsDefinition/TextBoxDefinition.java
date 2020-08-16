package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import webPages.HomePage;
import webPages.tabs.TextBoxPage;

import java.util.concurrent.TimeUnit;

public class TextBoxDefinition {
    private HomePage homePage;
    private TextBoxPage textBoxPage;
    public WebDriver driver;

    @Given("^I am on the home page on URL \"([^\"]*)\"$")
    public void iAmOnTheHomePageOnURL(String url) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver, HomePage.class);
        textBoxPage = PageFactory.initElements(driver, TextBoxPage.class);
    }

    @When("^I go to the Text box page$")
    public void iGoToTheTextBoxPage() {
        homePage
                .goToElementsPage()
                .clickTextBoxButton();
    }

    @And("I input name {string}")
    public void iInputName(String name) {
        textBoxPage
                .inputIntoFullNameTextField(name);
    }

    @And("I input email address {string}")
    public void iInputEmailAddress(String emailAddress) {
        textBoxPage
                .inputIntoEmailTextField(emailAddress);
    }

    @And("I input current address {string}")
    public void iInputCurrentAddress(String currentAddress) {
        textBoxPage
                .inputIntoCurrentAddressTextField(currentAddress);
    }

    @And("I click Submit button")
    public void iClickSubmitButton() {
        textBoxPage
                .clickSubmitButton();
    }

    @Then("I see {string}, {string} in output information under the registration form")
    public void iSeeInOutputInformationUnderTheRegistrationForm(String name, String emailAddress) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(textBoxPage.getOutputName().contains(name),
                String.format("Full Name field contains: %s but you need %s",
                        textBoxPage.getOutputName(), name));

        softAssert.assertTrue(textBoxPage.getOutputEmail().contains(emailAddress),
                String.format("Email Address field contains: %s but you need %s",
                        textBoxPage.getOutputEmail(), emailAddress));

        softAssert.assertAll();
    }
}