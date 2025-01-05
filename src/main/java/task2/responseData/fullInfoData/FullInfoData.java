package task2.responseData.fullInfoData;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FullInfoData {
    private List<Results> results;
    private Info info;

    public FullInfoData(){}
}
