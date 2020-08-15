package webPages.tabs;

import helper.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pojo.User;

import java.util.List;

public class WebTablesPage extends LeftTabsPanel {

    private final String USER_EMAIL_ADDRESS = "///div[contains(text(),'%s')]";

    private final String EDIT_USER_BUTTON = "//div[contains(text(),'%s')]/../div[last()]/*/span[@title='Edit']";

    private final String DELETE_USER_BUTTON = "//div[contains(text(),'%s')]/../div[last()]/*/span[@title='Delete']";

    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(id = "searchbox")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='rt-tbody']")
    private List<WebElement> tableBody;

    @FindBy(xpath = "//div[@class='rt-tr-group']/*/div")
    private List<WebElement> textFromGrid;

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    public int getTableSize() {
        return tableBody.size();
    }

    // TODO not final realization;
    public String getUserEmailAddress(User emailAddress) {
        return getDriver().findElement(By.xpath(String.format(USER_EMAIL_ADDRESS, emailAddress))).getText();
    }

    public boolean isUserPresent(User text) {
        return textFromGrid.stream().anyMatch(o1 -> o1.getText().equalsIgnoreCase(text.toString()));
    }

    public RegistrationPage clickEditUserButton(User user) {
        getDriver().findElement(By.xpath(String.format(EDIT_USER_BUTTON, user.toString()))).click();
        return PageFactory.initElements(getDriver(), RegistrationPage.class);
    }

    public WebTablesPage clickDeleteUserButton(User user) {
        getDriver().findElement(By.xpath(String.format(DELETE_USER_BUTTON, user.toString()))).click();
        return PageFactory.initElements(getDriver(), WebTablesPage.class);
    }

    public RegistrationPage clickAddButton() {
        addButton.click();
        return PageFactory.initElements(getDriver(), RegistrationPage.class);
    }
}