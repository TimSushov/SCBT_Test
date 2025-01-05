package task3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import task3.steps.MainPage;
import task3.steps.Urls3;

import static com.codeborne.selenide.Selenide.open;

public class ValidationCheckFormTest {
    MainPage mainPage = new MainPage();

    @Test
    public void inputTest() {
        Configuration.pageLoadTimeout = Long.parseLong("90000");
        Configuration.browserSize = "1920x1080";
        open(Urls3.BASE_URL3);
        mainPage.clickSubmitButton();
        mainPage.validationFirstName();
        mainPage.validationLastName();
        mainPage.validationEmail(); //bug
        mainPage.validationGender();
        mainPage.validationMobileNumber();
        mainPage.validationDateOfBirthInput(); //bug
        mainPage.validationHobbies(); //bug

    }
}
