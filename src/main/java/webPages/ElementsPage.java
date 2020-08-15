package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webPages.tabs.*;

public class ElementsPage extends LeftTabsPanel {

    @FindBy(id = "item-0")
    private WebElement textBoxButton;

    @FindBy(id = "item-1")
    private WebElement checkBoxButton;

    @FindBy(id = "item-2")
    private WebElement radioButtonButton;

    @FindBy(id = "item-3")
    private WebElement webTablesButton;

    @FindBy(id = "item-4")
    private WebElement buttonsButton;

    @FindBy(id = "item-5")
    private WebElement linksButton;

    @FindBy(id = "item-6")
    private WebElement uploadAndDownloadButton;

    @FindBy(id = "item-7")
    private WebElement dynamicPropertiesButton;

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public TextBoxPage clickTextBoxButton() {
        textBoxButton.click();
        return PageFactory.initElements(getDriver(), TextBoxPage.class);
    }

    public CheckBoxPage clickCheckBoxButton() {
        checkBoxButton.click();
        return PageFactory.initElements(getDriver(), CheckBoxPage.class);
    }

    public RadioButtonPage clickRadioButtonButton() {
        radioButtonButton.click();
        return PageFactory.initElements(getDriver(), RadioButtonPage.class);
    }

    public WebTablesPage clickWebTablesButton() {
        webTablesButton.click();
        return PageFactory.initElements(getDriver(), WebTablesPage.class);
    }

    public ButtonsPage clickButtonsButton() {
        buttonsButton.click();
        return PageFactory.initElements(getDriver(), ButtonsPage.class);
    }

    public LinksPage clickLinksButton() {
        linksButton.click();
        return PageFactory.initElements(getDriver(), LinksPage.class);
    }

    public UploadDownloadPage clickUploadDownloadPageButton() {
        uploadAndDownloadButton.click();
        return PageFactory.initElements(getDriver(), UploadDownloadPage.class);
    }

    public DynamicPropertiesPage clickDynamicPropertiesButton() {
        dynamicPropertiesButton.click();
        return PageFactory.initElements(getDriver(), DynamicPropertiesPage.class);
    }
}