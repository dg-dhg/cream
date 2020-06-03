package net.dhg.crm.config;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//现在重写配置类的方法就可以实现拦截器

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("tables.html").setViewName("tables");
        registry.addViewController("forms.html").setViewName("forms");
        registry.addViewController("login.html").setViewName("login");
        registry.addViewController("register.html").setViewName("register");
        registry.addViewController("charts.html").setViewName("charts");
    }
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
