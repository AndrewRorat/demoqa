package webPages;

import enums.EPagesIndex;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Data
public class HomePage {

    private final String PAGE_CARDS = "//h5[text()='%s']/../..";

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public AlertsFrameWindowsPage goToAlertsFrameWindowsPage() {
        driver.findElement(By.xpath(String.format(PAGE_CARDS,
                EPagesIndex.ALERTS_FRAME_WINDOWS_PAGE))).click();
        return PageFactory.initElements(driver, AlertsFrameWindowsPage.class);
    }

    public BookStoreAppPage goToBookStoreAppPage() {
        driver.findElement(By.xpath(String.format(PAGE_CARDS,
                EPagesIndex.BOOK_STORE_APP_PAGE))).click();
        return PageFactory.initElements(driver, BookStoreAppPage.class);
    }

    public ElementsPage goToElementsPage() {
        driver.findElement(By.xpath(String.format(PAGE_CARDS,
                EPagesIndex.ELEMENTS_PAGE.getName()))).click();
        return PageFactory.initElements(driver, ElementsPage.class);
    }

    public FormsPage goToFormsPage() {
        driver.findElement(By.xpath(String.format(PAGE_CARDS,
                EPagesIndex.FORMS_PAGE))).click();
        return PageFactory.initElements(driver, FormsPage.class);
    }

    public InteractionsPage goToInteractionsPage() {
        driver.findElement(By.xpath(String.format(PAGE_CARDS,
                EPagesIndex.INTERACTIONS_PAGE))).click();
        return PageFactory.initElements(driver, InteractionsPage.class);
    }

    public WidgetsPage goToWidgetsPage() {
        driver.findElement(By.xpath(String.format(PAGE_CARDS,
                EPagesIndex.WIDGETS_PAGE))).click();
        return PageFactory.initElements(driver, WidgetsPage.class);
    }
}