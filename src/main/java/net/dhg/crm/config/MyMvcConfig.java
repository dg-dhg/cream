package net.dhg.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//现在重写配置类的方法就可以实现拦截器

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
    @Bean
    public ViewResolver dengViewResolver(){
        return new DengViewResolver();
    }

    public static class DengViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
