package UI;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class WebTable extends PageObject {

    @FindBy(xpath = "//div[contains(text(),'Cierra')]")
    public static WebElementFacade firstName;

    @FindBy(xpath = "//div[contains(text(),'Vega')]")
    public static WebElementFacade lastName;

    @FindBy(xpath = "//div[contains(text(),'39')]")
    public static WebElementFacade age;

    @FindBy(xpath = "//div[contains(text(),'cierra@example.com')]")
    public static WebElementFacade email;

    @FindBy(xpath = "//div[contains(text(),'10000')]")
    public static WebElementFacade salary;

    @FindBy(xpath = "//div[contains(text(),'Insurance')]")
    public static WebElementFacade department;

    @FindBy(xpath = "//div[contains(text(),'Sun')]")
    public static WebElementFacade firstNameEdit;

    @FindBy(xpath = "//div[contains(text(),'Team')]")
    public static WebElementFacade lastNameEdit;

    @FindBy(xpath = "//div[contains(text(),'18')]")
    public static WebElementFacade ageEdit;

    @FindBy(xpath = "//div[contains(text(),'Sun123@gmail.com')]")
    public static WebElementFacade emailEdit;

    @FindBy(xpath = "//div[contains(text(),'100000')]")
    public static WebElementFacade salaryEdit;

    @FindBy(xpath = "//div[contains(text(),'Tester Team')]")
    public static WebElementFacade departmentEdit;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]")
    public static WebElementFacade firstNameNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]")
    public static WebElementFacade lastNameNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[3]")
    public static WebElementFacade ageNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[4]")
    public static WebElementFacade emailNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[5]")
    public static WebElementFacade salaryNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[6]")
    public static WebElementFacade departmentNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]")
    public static WebElementFacade fNameDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]")
    public static WebElementFacade lNameDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[3]")
    public static WebElementFacade ageDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[4]")
    public static WebElementFacade emailDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[5]")
    public static WebElementFacade salaryDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[6]")
    public static WebElementFacade departmentDelete;

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    public static WebElementFacade add;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]")
    public static WebElementFacade deleteIcon;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[1]")
    public static WebElementFacade editIcon;

    @FindBy(xpath = "//div[@id='registration-form-modal']")
    public static WebElementFacade formName;

    @FindBy(xpath = "//input[@id='firstName']")
    public static WebElementFacade firstnameinput;

    @FindBy(xpath = "//input[@id='lastName']")
    public static WebElementFacade lastnameinput;

    @FindBy(xpath = "//input[@id='userEmail']")
    public static WebElementFacade emailinput;

    @FindBy(xpath = "//input[@id='age']")
    public static WebElementFacade ageinput;

    @FindBy(xpath = "//input[@id='salary']")
    public static WebElementFacade salaryinput;

    @FindBy(xpath = "//input[@id='department']")
    public static WebElementFacade departmentinput;

    @FindBy(xpath = "//button[@id='submit']")
    public static WebElementFacade submit;

}
