package task2;

import org.junit.jupiter.api.Test;
import task2.steps.GetUserInfoStep;

public class FullInfoUserTest {
     GetUserInfoStep getFullInfo = new GetUserInfoStep();

    @Test
    public void getFullInfo(){
        getFullInfo.getFullInfo();

    }
}
