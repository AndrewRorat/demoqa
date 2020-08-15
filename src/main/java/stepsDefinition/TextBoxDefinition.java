package stepsDefinition;

import data.UserRepository;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pojo.User;
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
    @And("I input correct first name")
    public void iInputCorrectFirstName() {
        textBoxPage
        .inputIntoFullNameTextField(UserRepository.getMark().getFirstName());
    }

    @And("I input correct email address")
    public void iInputCorrectEmailAddress() {
        textBoxPage
                .inputIntoEmailTextField(UserRepository.getMark().getEmailAddress());
    }

    @And("I input current address")
    public void iInputCurrentAddress() {
        textBoxPage
                .inputIntoCurrentAddressTextField(UserRepository.getMark().getDepartment());
    }

    @And("I click Submit button")
    public void iClickSubmitButton() {
        textBoxPage
                .clickSubmitButton();
    }

    @Then("^I see \"([^\"]*)\" output information under the registration form$")
    public void iSeeOutputInformationUnderTheRegistrationForm(String arg0) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(textBoxPage.getOutputName().contains(UserRepository.getMark().getFirstName()));
        softAssert.assertTrue(textBoxPage.getOutputName().contains(UserRepository.getMark().getEmailAddress()));
        softAssert.assertAll();
    }



}