package task2.responseData.fullInfoData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Timezone {
    private String offset;
    private String description;

    public Timezone(){}
}
