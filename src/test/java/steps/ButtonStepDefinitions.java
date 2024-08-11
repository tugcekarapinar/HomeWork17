package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ElementsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ButtonStepDefinitions {

    ElementsPage elementsPage;

    public ButtonStepDefinitions(){
        elementsPage = new ElementsPage();
    }

    @Given("For Elements Page webDriver is set and configuration settings are made")
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        Configuration.timeout = 10000;
    }

    @When("User navigates to the elements page")
    public void userNavigatesToTheElementsPage() {
        Selenide.open("https://demoqa.com/elements");
        getWebDriver().manage().window().maximize();
    }

    @And("User clicks on the Buttons option")
    public void userClicksOnTheButtonsOption() {
        elementsPage.ButtonsOption().click();
    }

    @And("User clicks the Click Me button")
    public void userClicksTheClickMeButton() {
        elementsPage.ClickButton().click();
    }

    @Then("User should see the message {string}")
    public void theUserShouldSeeTheMessage(String expectedMessage) {
        elementsPage.DynamicClickMessage().shouldHave(text(expectedMessage));
    }
}