package task2.responseData.fullInfoData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private int  postcode;
    private Coordinates coordinates;
    private Timezone timezone;


    public Location(){}
}
