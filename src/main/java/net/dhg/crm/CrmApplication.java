package net.dhg.crm;

import net.dhg.crm.modelling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//这个注解的简单解释：由SpringBootConfiguration和EnableAutoConfiguration两个注解组成，前者同时标志着这是一个配置
// ，而任一配置都是一个组件
@SpringBootApplication
public class CrmApplication {

    public static void main(String[] args) {
        /*
        * SpringApplication主要做了如下四个工作
        * 推断应用的类型是普通java项目还是java web项目
        * 查找并加载所有的初始化器，设置到initializer中
        *找出所有的应用程序监听器，设置到listener中
        * 推断并设置main方法的定义类，找到运行的主类
        * */
        SpringApplication.run(CrmApplication.class, args);
    }
}
