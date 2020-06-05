package net.dhg.crm.controller;

import net.dhg.crm.dao.DepartmentDao;
import net.dhg.crm.dao.EmployeeDao;
import net.dhg.crm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/list")
    public String employeeTable(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();
        model.addAttribute("employees", employees);
        return "emp/list";
    }

    @RequestMapping("/toSave")
    public String toSave(Model model) {
        //准备下拉列的部门信息
        model.addAttribute("departments",departmentDao.getDepartment());
        return "emp/toSave";
    }
    @RequestMapping("/save")
    public  String save(){
        return "redirect:/employee/list";
    }



}
