package task4.steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement vacancyButton =  $(byXpath("//button//div[text()='Вакансии']"));

    public void clickVacancyButton(){
        vacancyButton.click();
    }

}
