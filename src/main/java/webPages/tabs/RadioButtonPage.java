package webPages.tabs;

import helper.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends LeftTabsPanel {

    @FindBy(xpath = "//div[@class='mb-3']/../*[2]")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@class='mb-3']/../*[3]")
    private WebElement impressiveButton;

    @FindBy(xpath = "//span[@class='text-success']")
    private WebElement selectedText;

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public RadioButtonPage clickYesButton() {
        Util.clickIfNotSelected(yesButton);
        return PageFactory.initElements(getDriver(), RadioButtonPage.class);
    }

    public RadioButtonPage clickImpressiveButton() {
        Util.clickIfNotSelected(impressiveButton);
        return PageFactory.initElements(getDriver(), RadioButtonPage.class);
    }

    public String getSelectedText() {
        return selectedText.getText();
    }
}