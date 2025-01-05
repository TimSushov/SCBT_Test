package task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import task1.steps.ChangeUrlSteps;

public class ChangeUrlTest {

    ChangeUrlSteps changeUrlSteps = new ChangeUrlSteps();

    @ParameterizedTest
    @CsvFileSource(resources = "/task1/DataUrlsTests.csv", numLinesToSkip = 1)
    public void ChangeLonfToShortUrl(int statusCode, String longUrl){
        changeUrlSteps.changeUrlSteps(statusCode, longUrl);
    }
}
