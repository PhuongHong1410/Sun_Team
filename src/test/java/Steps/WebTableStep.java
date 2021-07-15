package Steps;

import PageObject.WebTablePageObject;
import Pages.WebTablePage;
import UI.WebTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import Serenity.WebTableSerenity;

import java.util.List;

public class WebTableStep {
    WebTable ui;
    @Steps
    WebTableSerenity webtableSerenity;
    WebTablePage webTablePage;

    @Given("^Open home page$")
    public void openHomePage() {
        webTablePage.openHomePage();
    }


    @When("^Click on add button$")
    public void clickOnAddButton() {
        webtableSerenity.clickAddButton();
    }


    @And("^Enter data to all textfield$")
    public void enterDataToAllTextfield(List<WebTablePageObject> usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            ui.firstnameinput.sendKeys(webtable.getFirstName());
            ui.lastnameinput.sendKeys(webtable.getLastName());
            ui.emailinput.sendKeys(webtable.getEmail());
            ui.ageinput.sendKeys(webtable.getAge());
            ui.salaryinput.sendKeys(webtable.getSalary());
            ui.departmentinput.sendKeys(webtable.getDepartment());
        }
    }

    @And("^Click submit button$")
    public void clickSubmitButton() {
        webtableSerenity.clickSubmitButton();
    }


    @Then("^The website display warning at email textfield$")
    public void theWebsiteDisplayWarningAtEmailTextfield() {
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.emailInputColorCode());
    }


    @Then("^The website display warning at age textfield$")
    public void theWebsiteDisplayWarningAtAgeTextfield() {
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.ageInputColorCode());
    }

    @Then("^The website display Default Member in Grid correct$")
    public void theWebsiteDisplayDefaultMemberInGridCorrect(List<WebTablePageObject> usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstName(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastName(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAge(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmail(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalary(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartment(), webtable.getDepartment());

        }

    }

    @Then("^The website display Registration Form correct$")
    public void theWebsiteDisplayRegistrationFormCorrect(List<WebTablePageObject> usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFormName(), webtable.getFormName());
        }
    }

    @Then("^The website display Member in Grid correct$")
    public void theWebsiteDisplayMemberInGridCorrect(List<WebTablePageObject> usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstNameNew(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastNameNew(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAgeNew(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmailNew(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalaryNew(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartmentNew(), webtable.getDepartment());

        }
    }

    @Then("^The website display warning at salary textfield$")
    public void theWebsiteDisplayWarningAtSalaryTextfield() {
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.salaryInputColorCode());
    }

    @Then("^The website display warning at all textfields$")
    public void theWebsiteDisplayWarningAtAllTextfields() {
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.firstNameInputColorCode());
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.lastNameInputColorCode());
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.ageInputColorCode());
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.emailInputColorCode());
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.salaryInputColorCode());
        Assert.assertEquals(webtableSerenity.expectedColorWhenFalse(), webtableSerenity.departmentInputColorCode());
    }

    @When("^Click on delete icon at any record$")
    public void clickOnDeleteIconAtAnyRecord() {
        webTablePage.clickDeleteIcon();
    }

    @Then("^The website display Member in Grid except record deleted$")
    public void theWebsiteDisplayMemberInGridExceptRecordDeleted() {

        Assert.assertEquals(webTablePage.getFirstNameDelete(), "");
        Assert.assertEquals(webTablePage.getLastNameDelete(), "");
        Assert.assertEquals(webTablePage.getAgeDelete(), "");
        Assert.assertEquals(webTablePage.getEmailDelete(), "");
        Assert.assertEquals(webTablePage.getSalaryDelete(), "");
        Assert.assertEquals(webTablePage.getDepartmentDelete(), "");

    }

    @When("^Click on edit icon button$")
    public void clickOnEditIconButton() {
        webTablePage.clickEditIcon();
    }

    @And("^Update data to all textfields$")
    public void updateDataToAllTextfields(List<WebTablePageObject> usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            ui.firstnameinput.clear();
            ui.firstnameinput.sendKeys(webtable.getFirstName());

            ui.lastnameinput.clear();
            ui.lastnameinput.sendKeys(webtable.getLastName());

            ui.emailinput.clear();
            ui.emailinput.sendKeys(webtable.getEmail());

            ui.ageinput.clear();
            ui.ageinput.sendKeys(webtable.getAge());

            ui.salaryinput.clear();
            ui.salaryinput.sendKeys(webtable.getSalary());

            ui.departmentinput.clear();
            ui.departmentinput.sendKeys(webtable.getDepartment());
        }
    }

    @Then("^The website display Member Updated in Grid correct$")
    public void theWebsiteDisplayMemberUpdatedInGridCorrect(List<WebTablePageObject> usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstNameEdit(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastNameEdit(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAgeEdit(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmailEdit(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalaryEdit(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartmentEdit(), webtable.getDepartment());

        }
    }
}
