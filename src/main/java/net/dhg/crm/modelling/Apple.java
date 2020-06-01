package net.dhg.crm.modelling;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Data
@Validated//表示开启数据校验
@Component
@ConfigurationProperties(prefix = "apple")
public class Apple {
    @Email(message = "your name should be email form ")
    private String name;
}
