package webPages.tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopPanel extends LeftTabsPanel {

    @FindBy (xpath = "//div[@class='main-header']")
    private WebElement title;

    public TopPanel(WebDriver driver) {
        super(driver);
    }

    public String getTitleText(){
        return title.getText();
    }
}
