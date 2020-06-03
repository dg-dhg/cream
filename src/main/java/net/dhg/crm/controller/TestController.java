package net.dhg.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping({"/","/index","index.html"})
    public String index(Model model){
        model.addAttribute("aString","Testing Thymeleaf");
        return "index";
    }
}
