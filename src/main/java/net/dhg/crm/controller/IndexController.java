package net.dhg.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("yourName","邓湖广");
        model.addAttribute("a","spring thymeleaf template");
        return "index";
    }
    @RequestMapping("/utext")
    public String text(Model model){
        model.addAttribute("msg","<h1>hello denghuguang!</h1>");
        return "utext";
    }

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("msg", Arrays.asList("denghuguang","limpidSkyCockroach"));
        return "list";
    }

}
