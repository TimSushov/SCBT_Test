package task3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import task3.steps.Credential;
import task3.steps.MainPage;
import task3.steps.SubmittingFormPage;
import task3.steps.Urls3;

import static com.codeborne.selenide.Selenide.open;

public class InputCheckFormTest {
    MainPage mainPage = new MainPage();
    SubmittingFormPage submittingFormPage = new SubmittingFormPage();

    private String firstName = Credential.FIRST_NAME;
    private String lastName = Credential.LAST_NAME;
    private String email = Credential.EMAIL;
    private String gender = Credential.GENDER_MALE;
    private String mobileNumber = Credential.MOBILE_NUMBER;
    private String dateOfBirth = Credential.DATE_OF_BIRTH;
    private String subjects = Credential.SUBJECTS;
    private String hobbies = Credential.HOBBIES_SPORTS;
    private String picture = Credential.PICTURE;
    private String currentAddress = Credential.CURRENT_ADDRESS;
    private String state = Credential.STATE;
    private String city = Credential.CITY;

    @Test
    public void inputTest(){
        Configuration.pageLoadTimeout = Long.parseLong("90000");
        Configuration.browserSize = "1920x1080";
        open(Urls3.BASE_URL3);
        mainPage.selectFirstName(firstName);
        mainPage.selectLastName(lastName);
        mainPage.selectUserEmail(email);
        mainPage.selectGender(gender);
        mainPage.selectMobileNumber(mobileNumber);
        mainPage.selectDateOfBirthInput(dateOfBirth);
        mainPage.selectSubjects(subjects);
        mainPage.selectHobbies(hobbies);
        mainPage.uploadPicture(picture);
        mainPage.selectСurrentAddress(currentAddress);
        mainPage.clickStateDropDown();
        mainPage.selectStateDropDown(state);
        mainPage.clickCityDropDown();
        mainPage.selectCityDropDown(city);
        mainPage.clickSubmitButton();
        submittingFormPage.checkOpenModalWindow();
        submittingFormPage.checkStudentNameValue(firstName, lastName);
        submittingFormPage.checkEmailValue(email);
        submittingFormPage.checkGenderValue(gender);
        submittingFormPage.checkMobileValue(mobileNumber); //bug
        submittingFormPage.checkDateOfBirthValue(dateOfBirth); //bug
        submittingFormPage.checkSubjectsValue(subjects); //bug
        submittingFormPage.checkHobbiesValue(hobbies);
        submittingFormPage.checkPictureValue();
        submittingFormPage.checkAddressValue(currentAddress);
        submittingFormPage.checkStateAndCityValue(state, city);
    }
}
