package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import webPages.HomePage;
import webPages.tabs.CheckBoxPage;

public class CheckBoxDefinition {
    private HomePage homePage;
    private CheckBoxPage checkBoxPage;

    @When("I go to the Check Box page")
    public void iGoToTheCheckBoxPage() {
        homePage
                .goToElementsPage()
                .clickCheckBoxButton();
    }

    @And("I check {string} and {string} checkbox")
    public void iCheckAndCheckbox(String arg0, String arg1) {

    }

    @Then("I see {string}, {string} in output information field")
    public void iSeeInOutputInformationField(String arg0, String arg1) {
    }

}
