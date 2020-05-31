package net.dhg.crm;

import net.dhg.crm.modelling.Apple;
import net.dhg.crm.modelling.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrmApplicationTests {
    @Autowired
    Apple apple;

    @Test
    void contextLoads() {
        System.out.println(apple);
    }

}
