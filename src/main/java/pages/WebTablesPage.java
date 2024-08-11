package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WebTablesPage {

    public WebTablesPage(){}

    public void OpenPage() {
        open("https://demoqa.com/webtables");
        getWebDriver().manage().window().maximize();
    }

    public SelenideElement AddButton() {
        return $("#addNewRecordButton").scrollTo();
    }

    public SelenideElement FirstNameField() {

        return $("#firstName").scrollTo();
    }

    public SelenideElement LastNameField() {

        return $("#lastName").scrollTo();
    }

    public SelenideElement EmailField() {

        return $("#userEmail").scrollTo();
    }

    public SelenideElement AgeField() {

        return $("#age").scrollTo();
    }

    public SelenideElement SalaryField() {

        return $("#salary").scrollTo();
    }

    public SelenideElement DepartmentField() {

        return $("#department").scrollTo();
    }

    public SelenideElement SubmitButton() {

        return $("#submit").scrollTo();
    }

    public SelenideElement EditButton(String firstName) {
        return $(By.xpath("//div[contains(text(), '" + firstName + "')]//..//div[@class='action-buttons']//span[contains(@title, 'Edit')]")).scrollTo();
    }

    public SelenideElement SalaryCell(String firstName) {
        return $(By.xpath("//div[contains(text(), '" + firstName + "')]//following-sibling::div[4]")).scrollTo();
    }
}