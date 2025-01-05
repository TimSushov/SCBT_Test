package task2;

import org.junit.jupiter.api.Test;
import task2.steps.GetUserInfoStep;

public class GenderUserTest {
    GetUserInfoStep getUserInfoStep = new GetUserInfoStep();

    @Test
    public void checkGender(){
        getUserInfoStep.getGenderInfo("male");
    }
}
