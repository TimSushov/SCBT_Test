package task2.responseData.fullInfoData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Info {
    private String seed;
    private int results;
    private int page;
    private String version;

    public Info(){}
}
