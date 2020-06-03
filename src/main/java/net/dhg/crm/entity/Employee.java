package net.dhg.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    public static final Integer MALE = 1;
    public static final Integer FEMALE = 0;
    private Integer id;
    private Integer gender;
    private String name;
    private String email;
    private Department department;
    private Date birth;


}
