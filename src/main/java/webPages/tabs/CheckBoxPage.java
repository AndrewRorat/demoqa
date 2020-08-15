package webPages.tabs;

import enums.ECheckBoxPageNames;
import helper.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CheckBoxPage extends LeftTabsPanel {

    private final String TOGGLE_BUTTON = "//span[contains(text(),'%s')]/../preceding-sibling::button[@title='Toggle']";

    private final String CHECKBOX_BUTTON = "//span[contains(text(),'%s')]/preceding-sibling::span[@class='rct-checkbox']";

    private final String treeElements = "//span[contains(text(),'%s')]";

    @FindBy(xpath = "//button[@title='Toggle']/*[1]")
    private List<WebElement> toggleButtonList;

    @FindBy(xpath = "//button[@title='Expand all']")
    private WebElement expendAllButton;

    @FindBy(xpath = "//button[@title='Collapse all']")
    private WebElement collapseAllButton;

    @FindBy(id = "result") //if null pointer -> xpath = "//span[@class='text-success']"
    private List<WebElement> selectedText;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public CheckBoxPage clickToggleButton(int toggleNumber) {
        Util.clickIfNotSelected(toggleButtonList.get(toggleNumber));
        return PageFactory.initElements(getDriver(), CheckBoxPage.class);
    }

    public CheckBoxPage clickCheckBox(ECheckBoxPageNames name) {
        WebElement checkBox = getDriver().findElement(By.xpath(String.format(CHECKBOX_BUTTON, name)));
        Util.clickIfNotSelected(checkBox);
        return PageFactory.initElements(getDriver(), CheckBoxPage.class);
    }

    public String getElementText(ECheckBoxPageNames elementName) {
        return getDriver().findElement(By.xpath(String.format(treeElements, elementName))).getText();
    }

    public String getSelectedText() {
        List selectedText = this.selectedText.stream().map(i -> i.getText()).collect(Collectors.toList());
        return selectedText.toString();
    }
}