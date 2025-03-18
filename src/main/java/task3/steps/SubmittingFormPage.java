package task3.steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;

public class SubmittingFormPage {

    private SelenideElement modalHead = $(byXpath("//div[text()='Thanks for submitting the form']"));
    private SelenideElement studentNameValue = $(byXpath("//td[text()='Student Name']/following::td[1]"));
    private SelenideElement studentEmailValue = $(byXpath("//td[text()='Student Email']/following::td[1]"));
    private SelenideElement genderValue = $(byXpath("//td[text()='Gender']/following::td[1]"));
    private SelenideElement mobileValue = $(byXpath("//td[text()='Mobile']/following::td[1]"));
    private SelenideElement dateOfBirthValue = $(byXpath("//td[text()='Date of Birth']/following::td[1]"));
    private SelenideElement subjectsValue = $(byXpath("//td[text()='Subjects']/following::td[1]"));
    private SelenideElement hobbiesValue = $(byXpath("//td[text()='Hobbies']/following::td[1]"));
    private SelenideElement pictureValue = $(byXpath("//td[text()='Picture']/following::td[1]"));
    private SelenideElement addressValue = $(byXpath("//td[text()='Address']/following::td[1]"));
    private SelenideElement stateAndCityValue = $(byXpath("//td[text()='State and City']/following::td[1]"));

    public void checkOpenModalWindow (){
        modalHead.should(exist);
    }

    public void checkStudentNameValue (String firstName, String lastName){
        assertThat(studentNameValue.getText()).isEqualTo(firstName + " " +lastName);
    }

    public void checkEmailValue (String email){
        assertThat(studentEmailValue.getText()).isEqualTo(email);
    }

    public void checkGenderValue (String gender){
        assertThat(genderValue.getText()).isEqualTo(gender);
    }

    public void checkMobileValue (String mobile){
        assertThat(mobileValue.getText()).isEqualTo(mobile);
    }

    public void checkDateOfBirthValue(String dateOfBirth){
        assertThat(dateOfBirthValue.getText()).isEqualTo(dateOfBirth);
    }

    public void checkSubjectsValue(String subjects){
        assertThat(subjectsValue.getText()).isEqualTo(subjects);
    }

    public void checkHobbiesValue(String hobbies){
        assertThat(hobbiesValue.getText()).isEqualTo(hobbies);
    }

    public void checkPictureValue(){
        assertThat(pictureValue.getText()).isNotNull();
    }

    public void checkAddressValue(String address){
        assertThat(addressValue.getText()).isEqualTo(address);
    }

    public void checkStateAndCityValue (String state, String city){
        assertThat(stateAndCityValue.getText()).isEqualTo(state + " " +city);
    }
}
