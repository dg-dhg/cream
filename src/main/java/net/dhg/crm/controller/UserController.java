package net.dhg.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/index")
    public String index(@RequestParam String username, @RequestParam String password, Model model, HttpServletRequest request){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
        else{
            model.addAttribute("msg","用户名或密错误");
            return "login";
        }

    }
}
