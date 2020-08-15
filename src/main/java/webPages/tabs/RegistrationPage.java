package webPages.tabs;

import helper.Util;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pojo.User;

@Setter
public class RegistrationPage extends WebTablesPage {

    @FindBy(id = "registration-form-modal")
    private WebElement registrationFormText;

    @FindBy(xpath = "//div[@class='col-md-6 col-sm-6']/*[@id='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//div[@class='col-md-6 col-sm-6']/*[@id='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[@class='col-md-9 col-sm-12']/*[@id='userEmail']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//div[@class='col-md-2 col-sm-12']/*[@id='age']")
    private WebElement ageField;

    @FindBy(xpath = "//div[@class='col-md-9 col-sm-12']/*[@id='salary']")
    private WebElement salaryField;

    @FindBy(xpath = "//div[@class='col-md-6 col-sm-6']/*[@id='department']")
    private WebElement departmentField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRegistrationPageOpen(){
        return registrationFormText.isDisplayed();
    }

    public void setFirstName(User firstName){
        Util.clearField(firstNameField);
        firstNameField.sendKeys(firstName.getFirstName());
    }

    public void setLastName(User lastName){
        Util.clearField(lastNameField);
        lastNameField.sendKeys(lastName.getLastName());
    }

    public void setEmailAddress(User emailAddress){
        Util.clearField(emailAddressField);
        emailAddressField.sendKeys(emailAddress.getEmailAddress());
    }

    public void setAge(User age){
        Util.clearField(ageField);
        ageField.sendKeys(age.getAge().toString());
    }

    public void setSalary(User salary){
        Util.clearField(salaryField);
        salaryField.sendKeys(salary.getSalary().toString());
    }

    public void setDepartment(User department){
        Util.clearField(departmentField);
        salaryField.sendKeys(department.getDepartment());
    }

    public WebTablesPage clickSubmitButton(){
        submitButton.click();
        return PageFactory.initElements(getDriver(), WebTablesPage.class);
    }
}
