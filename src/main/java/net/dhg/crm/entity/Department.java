package net.dhg.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data//帮助自动生成，getter/setter ，equals，canEquals，toString
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private String departmentName;
    private Integer id;
}
