package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Integer age;
    private Integer salary;
    private String department;
}