package net.dhg.crm.modelling;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Dog {
    @Value("mimi")
    private String name;
    @Value("13")
    private Integer age;
}
