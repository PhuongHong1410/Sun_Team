
package Serenity;

import net.thucydides.core.steps.ScenarioSteps;
import Pages.WebTablePage;

public class WebTableSerenity extends ScenarioSteps {
    WebTablePage webtablePage;

    public void openHomePage() {
        webtablePage.open();
    }

    public String getFirstName() {
        return webtablePage.getFirstName();
    }

    public String getLastName() {
        return webtablePage.getLastName();
    }

    public String getAge() {
        return webtablePage.getAge();
    }

    public String getEmail() {
        return webtablePage.getEmail();
    }

    public String getSalary() {
        return webtablePage.getSalary();
    }

    public String getDepartment() {
        return webtablePage.getDepartment();
    }

    public String getFirstNameNew() {
        return webtablePage.getFirstNameNew();
    }

    public String getLastNameNew() {
        return webtablePage.getLastNameNew();
    }

    public String getAgeNew() {
        return webtablePage.getAgeNew();
    }

    public String getEmailNew() {
        return webtablePage.getEmailNew();
    }

    public String getSalaryNew() {
        return webtablePage.getSalaryNew();
    }

    public String getDepartmentNew() {
        return webtablePage.getDepartmentNew();
    }

    public void clickAddButton() {
        webtablePage.clickAddButton();
    }
    public void clickEditIcon() {
        webtablePage.clickEditIcon();
    }
    public void clickDeleteIcon() {
        webtablePage.clickDeleteIcon();
    }

    public String getFormName() {
        return webtablePage.getFormName();
    }

    public void clickSubmitButton() {
        webtablePage.clickSubmitButton();
    }

    public String firstNameInputColorCode() {

        return webtablePage.firstNameInputColorCode();
    }
    public String lastNameInputColorCode() {

        return webtablePage.lastNameInputColorCode();
    }
    public String emailInputColorCode() {

        return webtablePage.emailInputColorCode();
    }

    public String ageInputColorCode() {

        return webtablePage.ageInputColorCode();
    }
    public String salaryInputColorCode() {

        return webtablePage.salaryInputColorCode();
    }
    public String departmentInputColorCode() {

        return webtablePage.departmentInputColorCode();
    }

    public String expectedColorWhenFalse() {
        String expectedColorCodeInRGB = "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }

    public String expectedColorWhenTrue() {

        return "rgb(40, 167, 69)";
    }
}
