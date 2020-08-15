package helper;

import org.openqa.selenium.WebElement;

public class Util {

    public static boolean isElementEnabled(WebElement element) {
        return element.isEnabled();
    }

    public static void clickIfNotSelected(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }
    }

    public static void clearField(WebElement element) {
        if (!element.isSelected()) {
            element.click();
            element.clear();
        }
    }

    public static void inputIntoField(WebElement element, String string) {
        element.sendKeys(string);
    }
}