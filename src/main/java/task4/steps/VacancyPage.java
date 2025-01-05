package task4.steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class VacancyPage {
    private SelenideElement cityDropdown =  $(byXpath("//input[@placeholder='Все города']"));
    private SelenideElement companyDropdown =  $(byXpath("//label[contains(text(),'Компания')]"));
    private SelenideElement city;
    private SelenideElement company;
    private SelenideElement vacancyHeader = $(byXpath("//div[@class='header-block']//h1"));
    private ElementsCollection descriptionAllVacancy = $$(byXpath("//div[@class='block-vacancy']//span"));
    private SelenideElement moreVacancyHyperText = $(byXpath("//div[@class='link-1 load-more mx-auto']"));

    public void setCity (String city){
        this.city = $(byXpath("//div[@options='desktop-filters']//div[contains(text(),'"+city+"')]"));
    }

    public void setCompany (String company){
        this.company = $(byXpath("//div[@options='desktop-filters']//div[contains(text(),'"+company+"')]"));
    }

    public void selectCityDropdown(String city){
        cityDropdown.setValue(city).pressEnter();
        setCity(city);
        this.city.click();
    }

    public void selectCompanyDropdown(String company) {
        companyDropdown.click();
        setCompany(company);
        this.company.click();
    }

    public void checkVisibleHeaderVacancyInSCB() {
        vacancyHeader.should(exist);
    }

    public void checkCityCompany (String city, String company){
        sleep(5000);
        if(moreVacancyHyperText.isEnabled()){
            moreVacancyHyperText.click();
        }
        sleep(3000);
        List<String> vacancy = new ArrayList<>();
        vacancy = descriptionAllVacancy.texts();
        for (String element : vacancy) {
            assertThat(element.contains(city)).isTrue();
            assertThat(element.contains(company)).isTrue();
        }

    }
}
