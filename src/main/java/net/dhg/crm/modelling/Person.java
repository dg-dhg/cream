package net.dhg.crm.modelling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component//即为组件的意思
@ToString
//@PropertySource("classpath:dengsir.yml")
@ConfigurationProperties(prefix = "person")
public class Person {
//    @Value("${name}")
    private String name;
//    @Value("${age}")
    private Integer age;
//    @Value("${happy}")
    private Boolean happy;
//    @Value("${birth}")
    private Date birth;
//    @Value("${map}")
    private Map<String,Object> map;
//    @Value("${list}")
    private List<Object> list;
    //大抵是通过反射机制加载配置文件，在初始化的时候为变量赋值，恐怕有一种处理机制使得配置的信息可以传递给特定的类
//    @Value("${dog}")
    private Dog dog;


}
