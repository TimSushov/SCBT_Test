package task3.steps;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage{

    private SelenideElement firstNameTextField =  $(byId("firstName"));
    private SelenideElement lastNameTextField =  $(byId("lastName"));
    private SelenideElement emailTextField =  $(byId("userEmail"));
    private SelenideElement maleGenderRadioButton = $(byXpath("//*[@id='genterWrapper']//label[text()='Male']"));
    private SelenideElement femaleGenderRadioButton = $(byXpath("//*[@id='genterWrapper']//label[text()='Female']"));
    private SelenideElement otherAttackHellicopterGenderRadioButton = $(byXpath("//*[@id='genterWrapper']//label[text()='Other']"));
    private SelenideElement mobileNumberTextField =  $(byId("userNumber"));
    private SelenideElement dateOfBirthTextField =  $(byId("dateOfBirthInput"));
    private SelenideElement subjectsTextField = $(byXpath("//input[@id='subjectsInput']"));
    private SelenideElement sportsHobbiesRadioButton = $(byXpath("//*[@id='hobbiesWrapper']//label[text()='Sports']"));
    private SelenideElement readingHobbiesGenderRadioButton = $(byXpath("//*[@id='genterWrapper']//label[text()='Reading']"));
    private SelenideElement musicHobbiesRadioButton = $(byXpath("//*[@id='genterWrapper']//label[text()='Music']"));
    private SelenideElement uploadPictureButton =  $(byId("uploadPicture"));
    private SelenideElement currentAddressTextField =  $(byId("currentAddress"));
    private SelenideElement selectStateDropDown = $(byXpath("//div[@id='state']//div[text()='Select State']"));
    private SelenideElement selectStateNCR = $(byXpath("//div[@id='state']//div[text()='NCR']"));
    private SelenideElement selectStateUttarPradesh = $(byXpath("//div[@id='state']//div[text()='Uttar Pradesh']"));
    private SelenideElement selectStateHaryana = $(byXpath("//div[@id='state']//div[text()='Haryana']"));
    private SelenideElement selectStateRajasthan = $(byXpath("//div[@id='state']//div[text()='Rajasthan']"));
    private SelenideElement selectCityDropDown = $(byXpath("//div[@id='city']//div[text()='Select City']"));
    private SelenideElement selectStateNCRCityDelhi = $(byXpath("//div[@id='city']//div[text()='Delhi']"));
    private SelenideElement selectStateNCRCityGurgaon = $(byXpath("//div[@id='city']//div[text()='Gurgaon']"));
    private SelenideElement selectStateNCRCityNoida = $(byXpath("//div[@id='city']//div[text()='Noida']"));
    private SelenideElement selectStateUttarPradeshCityAgra= $(byXpath("//div[@id='city']//div[text()='Agra']"));
    private SelenideElement selectStateUttarPradeshCityLucknow = $(byXpath("//div[@id='city']//div[text()='Lucknow']"));
    private SelenideElement selectStateUttarPradeshCityMerrut = $(byXpath("//div[@id='city']//div[text()='Merrut']"));
    private SelenideElement selectStateHaryanaCityKarnal = $(byXpath("//div[@id='city']//div[text()='Karnal']"));
    private SelenideElement selectStateHaryanaCityPanipat = $(byXpath("//div[@id='city']//div[text()='Panipat']"));
    private SelenideElement selectStateRajasthanCityJaipur = $(byXpath("//div[@id='city']//div[text()='Jaipur']"));
    private SelenideElement selectStateRajasthanCityJaiselmer = $(byXpath("//div[@id='city']//div[text()='Jaiselmer']"));
    private SelenideElement submitButton =  $(byId("submit"));

    public void selectFirstName(String firstName){
        firstNameTextField.should(exist).setValue(firstName);
    }

    public void selectLastName(String lastName){
        lastNameTextField.setValue(lastName);
    }

    public void selectUserEmail(String userEmail){
        emailTextField.setValue(userEmail);
    }

    public void selectGender(String gender){
        if(gender.equals("Male")){
            maleGenderRadioButton.click();
        } else if (gender.equals("Female")){
            femaleGenderRadioButton.click();
        } else {
            otherAttackHellicopterGenderRadioButton.click();
        }
    }

    public void selectMobileNumber(String mobileNumber){
        mobileNumberTextField.setValue(mobileNumber);
    }

    public void selectDateOfBirthInput(String dateOfBirthInput){
        dateOfBirthTextField.doubleClick().doubleClick().setValue(dateOfBirthInput).pressEnter();
    }

    public void selectSubjects(String subjects){
        subjectsTextField.setValue(subjects);
    }

    public void selectHobbies(String hobbies){
        if(hobbies.equals("Sports")){
            sportsHobbiesRadioButton.click();
        } else if (hobbies.equals("Reading")){
            readingHobbiesGenderRadioButton.click();
        } else if (hobbies.equals("Music")){
            musicHobbiesRadioButton.click();
        }
    }

    public void uploadPicture (String uploadPicture){
//        uploadPictureButton.setValue(uploadPicture);
        uploadPictureButton.uploadFile(new File(uploadPicture));
    }

    public void selectСurrentAddress(String currentAddress){
        currentAddressTextField.setValue(currentAddress);
    }

    public void clickStateDropDown( ){
        selectStateDropDown.click();
    }

    public void selectStateDropDown(String stateDropDown){
        if(stateDropDown.equals("NCR")){
            selectStateNCR.click();
        } else if (stateDropDown.equals("Uttar Pradesh")){
            selectStateUttarPradesh.click();
        } else if (stateDropDown.equals("Haryana")){
            selectStateHaryana.click();
        } else if (stateDropDown.equals("Rajasthan")) {
            selectStateRajasthan.click();
        }
    }

    public void clickCityDropDown( ){
        selectCityDropDown.click();
    }

    public void selectCityDropDown(String cityDropDown){
        if(cityDropDown.equals("Delhi")){
            selectStateNCRCityDelhi.click();
        } else if (cityDropDown.equals("Gurgaon")){
            selectStateNCRCityGurgaon.click();
        } else if (cityDropDown.equals("Noida")){
            selectStateNCRCityNoida.click();
        } else if (cityDropDown.equals("Agra")){
            selectStateUttarPradeshCityAgra.click();
        } else if (cityDropDown.equals("Lucknow")){
            selectStateUttarPradeshCityLucknow.click();
        } else if (cityDropDown.equals("Merrut")){
            selectStateUttarPradeshCityMerrut.click();
        } else if (cityDropDown.equals("Karnal")){
            selectStateHaryanaCityKarnal.click();
        } else if (cityDropDown.equals("Panipat")){
            selectStateHaryanaCityPanipat.click();
        } else if (cityDropDown.equals("Jaipur")){
            selectStateRajasthanCityJaipur.click();
        } else if (cityDropDown.equals("Jaiselmer")){
            selectStateRajasthanCityJaiselmer.click();
        }
    }

    public void clickSubmitButton (){
        submitButton.click();
    }

    public void validationFirstName(){
        firstNameTextField.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    public void validationLastName(){
        lastNameTextField.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    public void validationEmail(){
        emailTextField.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    public void validationMobileNumber(){
        mobileNumberTextField.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    public void validationDateOfBirthInput(){
        dateOfBirthTextField.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    public void validationGender(){
        maleGenderRadioButton.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    public void validationHobbies(){
        sportsHobbiesRadioButton.should(cssValue("border-color", "rgb(220, 53, 69)"));
    }
}
