package net.dhg.crm.controller;

import net.dhg.crm.modelling.Apple;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/hello")
public class HelloController {
    //写一个返回请求路径参数的控制器
    @RequestMapping("/world/{name}")
    public @ResponseBody String hello(@PathVariable String name){
        return String.format("hello world %s ",name );
    }


}
