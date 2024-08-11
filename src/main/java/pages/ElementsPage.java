package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ElementsPage {

    public ElementsPage(){}

    public SelenideElement ButtonsOption(){
        return $("#item-4").scrollTo();
    }

    public SelenideElement ClickButton() {
        return $(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).scrollTo();
    }

    public SelenideElement DynamicClickMessage() {
        return $("#dynamicClickMessage").scrollTo();
    }
}