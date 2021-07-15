package Pages;

import UI.WebTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/webtables")
public class WebTablePage extends PageObject {

    WebTable ui;

    public void openHomePage(){
        open();
    }
    public String getFirstName() {
        return ui.firstName.getTextValue();
    }

    public String getLastName() {
        return ui.lastName.getTextValue();
    }

    public String getAge() {
        return ui.age.getTextValue();
    }

    public String getEmail() {
        return ui.email.getTextValue();
    }

    public String getSalary() {
        return ui.salary.getTextValue();
    }

    public String getDepartment() {
        return ui.department.getTextValue();
    }

    public String getFirstNameNew() {
        return ui.firstNameNew.getTextValue();
    }

    public String getLastNameNew() {
        return ui.lastNameNew.getTextValue();
    }

    public String getAgeNew() {
        return ui.ageNew.getTextValue();
    }

    public String getEmailNew() {
        return ui.emailNew.getTextValue();
    }

    public String getSalaryNew() {
        return ui.salaryNew.getTextValue();
    }

    public String getDepartmentNew() {
        return ui.departmentNew.getTextValue();
    }
    public String getFirstNameEdit() {
        return ui.firstNameEdit.getTextValue();
    }

    public String getLastNameEdit() {
        return ui.lastNameEdit.getTextValue();
    }

    public String getAgeEdit() {
        return ui.ageEdit.getTextValue();
    }

    public String getEmailEdit() {
        return ui.emailEdit.getTextValue();
    }

    public String getSalaryEdit() {
        return ui.salaryEdit.getTextValue();
    }

    public String getDepartmentEdit() {
        return ui.departmentEdit.getTextValue();
    }

    public String getFirstNameDelete() {
        return ui.fNameDelete.getTextValue();
    }

    public String getLastNameDelete() {
        return ui.lNameDelete.getTextValue();
    }

    public String getAgeDelete() {
        return ui.ageDelete.getTextValue();
    }

    public String getEmailDelete() {
        return ui.emailDelete.getTextValue();
    }

    public String getSalaryDelete() {
        return ui.salaryDelete.getTextValue();
    }

    public String getDepartmentDelete() {
        return ui.departmentDelete.getTextValue();
    }

    public void clickAddButton() {

        ui.add.click();
    }
    public void clickEditIcon() {

        ui.editIcon.click();
    }
    public void clickDeleteIcon() {

        ui.deleteIcon.click();
    }
    public String getFormName() {
        return ui.formName.getTextValue();
    }

    public void clickSubmitButton() {

        ui.submit.click();
    }


    public String firstNameInputColorCode() {
        String colorCode = ui.firstnameinput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String lastNameInputColorCode() {
        String colorCode = ui.lastnameinput.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String emailInputColorCode() {
        String colorCode = ui.emailinput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String ageInputColorCode() {
        String colorCode = ui.ageinput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String salaryInputColorCode() {
        String colorCode = ui.salaryinput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String departmentInputColorCode() {
        String colorCode = ui.departmentinput.getCssValue("border-bottom-color");
        return colorCode;
    }
}
