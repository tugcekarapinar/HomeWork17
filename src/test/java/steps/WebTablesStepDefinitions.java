package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.WebTablesPage;

import static com.codeborne.selenide.Condition.text;

public class WebTablesStepDefinitions {

    WebTablesPage webTablesPage;

    public WebTablesStepDefinitions() {
        webTablesPage = new WebTablesPage();
    }

    @Given("For Web Tables Page webDriver is set and configuration settings are made")
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        Configuration.timeout = 10000;
    }

    @When("User navigates to the web tables page")
    public void userNavigatesToTheWebTablesPage() {
        webTablesPage.OpenPage();
    }

    @And("User clicks on the Add button")
    public void userClicksOnTheAddButton() {
        webTablesPage.AddButton().click();
    }

    @And("User enters {string} as first name, {string} as last name, {string} as email, {string} as age, {string} as salary, and {string} as department")
    public void userEntersDetails(String firstName, String lastName, String email, String age, String salary, String department) {
        webTablesPage.FirstNameField().setValue(firstName);
        webTablesPage.LastNameField().setValue(lastName);
        webTablesPage.EmailField().setValue(email);
        webTablesPage.AgeField().setValue(age);
        webTablesPage.SalaryField().setValue(salary);
        webTablesPage.DepartmentField().setValue(department);
    }

    @And("User clicks on the Submit button")
    public void userClicksOnTheSubmitButton() {
        webTablesPage.SubmitButton().click();
    }

    @And("User clicks the {string}'s Edit button")
    public void userClicksTheEditButton(String firstName) {
        webTablesPage.AddButton().scrollTo();
        webTablesPage.EditButton(firstName).click();
    }

    @And("User enters new value {string} as salary")
    public void userEnterNewSalaryValue(String newSalary) {
        webTablesPage.SalaryField().setValue(newSalary);
    }

    @Then("User should see the {string}'s salary value is edited as new salary value {string}")
    public void theUserShouldSeeTheEditedFirstNameAs(String firstName, String editedSalary) {
        webTablesPage.SalaryCell(firstName).shouldHave(text(editedSalary));
    }
}