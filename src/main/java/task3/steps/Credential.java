package task3.steps;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Credential {
    public static final String FIRST_NAME = "Barsik" + new Random().nextInt(999);
    public static final String LAST_NAME = "Kotikov" + new Random().nextInt(999);
    public static final String EMAIL = "Barsik" + new Random().nextInt(999) + "-data@yandex.ru";
    public static final String GENDER_MALE = "Male" ;
    public static final String GENDER_FEMALE = "Female";
    public static final String GENDER_OTHER = "Other";
    public static final String MOBILE_NUMBER = "8999111223" + new Random().nextInt(9);
    public static final String DATE_OF_BIRTH = "05 Jan 199" + new Random().nextInt(9);
    public static final String SUBJECTS = "war attack flying cats " + new Random().nextInt(999);
    public static final String HOBBIES_SPORTS = "Sports" ;
    public static final String HOBBIES_READING = "Reading";
    public static final String HOBBIES_MUSIC = "Music";
    public static final String PICTURE = "C:\\Users\\TIMM\\Downloads\\photo_2024-10-24_14-02-46.jpg";
    public static final String CURRENT_ADDRESS = "Kotovskogo" + new Random().nextInt(999);;
    public static final String STATE = "NCR";
    public static final String CITY = "Noida";
}
