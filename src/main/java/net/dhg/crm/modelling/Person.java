package net.dhg.crm.modelling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component//即为组件的意思
@ToString
public class Person {
    @Value("DengSir")
    private String name;

    @Value("12")
    private Integer age;

    @Value("true")
    private Boolean happy;

    private Date birth;

    private Map<String,Object> map;

    private List<Object> list;

    private Dog dog;


}
