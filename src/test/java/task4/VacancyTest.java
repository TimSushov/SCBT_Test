package task4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import task4.steps.Credential4;
import task4.steps.MainPage;
import task4.steps.Urls4;
import task4.steps.VacancyPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class VacancyTest {
    MainPage mainPage = new MainPage();
    VacancyPage vacancyPage = new VacancyPage();

    private String city = Credential4.CITY;
    private String company = Credential4.COMPANY;

    @Test
    public void checkCityAndCompanyVacancy(){
        Configuration.browserSize = "1280x1080";
        open(Urls4.BASE_URL4);
        mainPage.clickVacancyButton();
        vacancyPage.checkVisibleHeaderVacancyInSCB();
        vacancyPage.selectCityDropdown(city);
        vacancyPage.selectCompanyDropdown(company);
        vacancyPage.checkCityCompany(city,company);
    }
}
