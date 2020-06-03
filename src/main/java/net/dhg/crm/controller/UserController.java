package net.dhg.crm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(@RequestParam String username, @RequestParam String password, Model model){
        return "ok";
    }
}
