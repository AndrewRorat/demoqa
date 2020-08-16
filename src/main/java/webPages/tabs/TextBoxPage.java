package webPages.tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TextBoxPage {

    private final int NAME_INDEX = 0;
    private final int EMAIL_INDEX = 1;
    private final int ADDRESS_INDEX = 2;

    private WebDriver driver;

    @FindBy(xpath = "//div[@id='userName-wrapper']/*[2]/input")
    private WebElement fullNameTextField;

    @FindBy(id = "userEmail")
    private WebElement emailTextField;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressTextField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='output']/div/p")
    private List<WebElement> outputTable;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public TextBoxPage inputIntoFullNameTextField(String text) {
        fullNameTextField.click();
        fullNameTextField.sendKeys(text);
        return PageFactory.initElements(driver, TextBoxPage.class);
    }

    public TextBoxPage inputIntoEmailTextField(String text) {
        emailTextField.click();
        emailTextField.sendKeys(text);
        return PageFactory.initElements(driver, TextBoxPage.class);
    }

    public TextBoxPage inputIntoCurrentAddressTextField(String text) {
        currentAddressTextField.click();
        currentAddressTextField.sendKeys(text);
        return PageFactory.initElements(driver, TextBoxPage.class);
    }

    public TextBoxPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public String getOutputName() {
        return outputTable.get(NAME_INDEX).getText();
    }

    public String getOutputEmail() {
        return outputTable.get(EMAIL_INDEX).getText();
    }

    public String getOutputAddress() {
        return outputTable.get(ADDRESS_INDEX).getText();
    }
}