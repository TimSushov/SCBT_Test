package task2;

import org.junit.jupiter.api.Test;
import task2.steps.GetUserInfoStep;

public class NumberResultInfoUserTest {
    GetUserInfoStep getUserInfoStep = new GetUserInfoStep();

    @Test
    public void checkNumberResults(){
        getUserInfoStep.getNumberResult(9);
    }

    @Test
    public void checkNumberResultsZero(){
        getUserInfoStep.getNumberResult(0);
    }

    @Test
    public void checkNumberResultsOverFiveThousand(){
        getUserInfoStep.getNumberResult(5001);
    }

}
