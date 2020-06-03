package net.dhg.crm.config;

import com.sun.corba.se.spi.resolver.LocalResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
@Slf4j
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("lang");
        log.info(language);
        Locale locale=Locale.getDefault();//若没有就是用默认的
        if (!StringUtils.isEmpty(language)){
            String[] localeString= language.split("_");
            locale = new Locale(localeString[0],localeString[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
