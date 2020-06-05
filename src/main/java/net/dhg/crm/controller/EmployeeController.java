package net.dhg.crm.controller;

import net.dhg.crm.dao.EmployeeDao;
import net.dhg.crm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/list")
    public String employeeTable(Model model){
        Collection<Employee> employees= employeeDao.getEmployees();
        model.addAttribute("employees",employees);
        return "tables";
    }
@RequestMapping("/save")
    public String save(){
        return "toSave";
}

}
