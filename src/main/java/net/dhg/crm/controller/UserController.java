package net.dhg.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/index")
    public String index(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpServletRequest request) {
        //设置session
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            request.getSession().setAttribute("loginUser", username);
            return "redirect:/user/toIndex";
        } else {
            model.addAttribute("msg", "用户名或密错误");
            return "login";
        }
    }


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }


    @RequestMapping("/common")
    public String common() {
        return "common/common";
    }
}