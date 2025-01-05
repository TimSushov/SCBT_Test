package task2.steps;

import task2.RequestSpec2;
import task2.responseData.fullInfoData.FullInfoData;
import task2.responseData.fullInfoData.Info;
import task2.responseData.fullInfoData.Results;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class GetUserInfoStep extends RequestSpec2 {
    public FullInfoData getFullInfo() {
        FullInfoData fullInfoData =
                given()
                        .spec(requestSpec())
                        .when()
                        .get()
                        .body().as(FullInfoData.class);

        assertThat(fullInfoData).isNotNull();

        return fullInfoData;
    }

    public void getGenderInfo(String genderInput) {
            FullInfoData fullInfoData =
                    given()
                            .spec(requestSpec())
                            .params("gender",genderInput )
                            .when()
                            .get()
                            .body().as(FullInfoData.class);
                    assertThat(genderInput).isEqualTo(checkGender(fullInfoData));
    }

    public String checkGender (FullInfoData fullInfoData) {
        List<Results> resultFromJson = new ArrayList<>();
        resultFromJson = fullInfoData.getResults();
        Results results = new Results();
        results = resultFromJson.get(0);
        return results.getGender();
    }



    public void getNumberResult(int numberResult){
        FullInfoData fullInfoData =
                given()
                        .spec(requestSpec())
                        .params("results", String.valueOf(numberResult) )
                        .when()
                        .get()
                        .body().as(FullInfoData.class);
        if (numberResult >= 1 && numberResult <= 5000) {
            assertThat(numberResult).isEqualTo(checkNumberResult(fullInfoData));
        } else if (numberResult <= 0) {
            assertThat(1).isEqualTo(checkNumberResult(fullInfoData));
        } else if (numberResult > 5000) {
            assertThat(1).isEqualTo(checkNumberResult(fullInfoData));
        }

    }

    public int checkNumberResult (FullInfoData fullInfoData) {
        Info info = new Info();
        info = fullInfoData.getInfo();
        return info.getResults();
    }
}





