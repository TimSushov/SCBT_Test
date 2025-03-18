package task2;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class RequestSpec2 {
    public RequestSpecification requestSpec(){
        RequestSpecification requestSpec =   new RequestSpecBuilder()
                .setBaseUri(Urls2.BASE_URL2)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
//                .addFilter(new ErrorLoggingFilter())
                .build();

        return requestSpec;
    }
}
