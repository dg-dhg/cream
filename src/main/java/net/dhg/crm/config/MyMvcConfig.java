package net.dhg.crm.config;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
        registry.addViewController("index.html").setViewName("index");
        registry.addViewController("register.html").setViewName("register");
        registry.addViewController("charts.html").setViewName("charts");
        registry.addViewController("register.html").setViewName("register");
    }

    //注册拦截器,添加拦截的请求到拦截器,让拦截器判断是否放行
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截和不拦截的url或说资源
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                //斜杠和无斜杠的区别是绝对路径和相对路径
                .excludePathPatterns("/user/index","/login.html","login.html","login","/user/login","**.css","**.js","/vendor/**","/js/**","/img/**","/css/**");
    }

    @Bean
    //国际化,地区解析,需要获取locale
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }

}
