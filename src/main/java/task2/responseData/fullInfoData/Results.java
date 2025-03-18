package task2.responseData.fullInfoData;

import groovyjarjarpicocli.CommandLine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Results {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private Dob dob;
    private Registered registered;
    private String phone;
    private String cell;
    private Id id;
    private Picture picture;
    private String nat;

    public Results(){}
}
