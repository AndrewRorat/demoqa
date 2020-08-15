package webPages.tabs;

import enums.EPagesIndex;
import helper.Util;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class LeftTabsPanel {

    private final String LEFT_PANEL_TABS = "//div[text()='%s']";

    private WebDriver driver;

    public LeftTabsPanel(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLeftPanelTab(EPagesIndex tab) {
        driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, tab))).click();
    }

    public void clickElementsButton() {
        WebElement result = driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, EPagesIndex.ELEMENTS_PAGE)));
        Util.clickIfNotSelected(result);
    }

    public void clickFormsButton() {
        WebElement result = driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, EPagesIndex.FORMS_PAGE)));
        Util.clickIfNotSelected(result);
    }

    public void clickAlertsFrameWindowsButton() {
        WebElement result = driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, EPagesIndex.ALERTS_FRAME_WINDOWS_PAGE)));
        Util.clickIfNotSelected(result);
    }

    public void clickWidgetsButton() {
        WebElement result = driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, EPagesIndex.WIDGETS_PAGE)));
        Util.clickIfNotSelected(result);
    }

    public void clickInteractionsButton() {
        WebElement result = driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, EPagesIndex.INTERACTIONS_PAGE)));
        Util.clickIfNotSelected(result);
    }

    public void clickBookStoreApplication() {
        WebElement result = driver.findElement(By.xpath(String.format(LEFT_PANEL_TABS, EPagesIndex.BOOK_STORE_APP_PAGE)));
        Util.clickIfNotSelected(result);
    }
}