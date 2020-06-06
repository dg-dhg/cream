package net.dhg.crm.dao;


import com.sun.org.apache.xpath.internal.operations.String;
import net.dhg.crm.entity.Department;
import net.dhg.crm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {


    private static Map<Integer, Employee> employees = new HashMap<>();

    @Autowired
    private  DepartmentDao departmentDao;

    static {
        employees.put(1001,new Employee(1001,Employee.MALE,"li","630909931@qq.com",102,new Date(2013,8,12)));
        employees.put(1005,new Employee(1005,Employee.MALE,"hong","630909931@qq.com",101,new Date(2012,1,12)));
        employees.put(1003,new Employee(1003,Employee.MALE,"liao","630909931@qq.com",103,new Date(2019,2,12)));
        employees.put(1056,new Employee(1056,Employee.MALE,"zhang","630909931@qq.com",104,new Date(2009,5,12)));

    }
    private static Integer initId=1057;

    //新增员工
    public void save(Employee employee){
        //主键为空
        if(employee.getId()==null || employee.getId()<0){
            employee.setId(initId++);
        }
        System.out.println("debug"+employee);
        employees.put(employee.getId(),employee);
    }


    //全部员工
    public Collection<Employee> getEmployees(){
        return employees.values();
    }
    //通过主键获取员工
    public  Employee  getEmployeeById(Integer id){
        Employee employee=employees.get(id);
        if (employee==null){
            System.out.println("不存在");
            return null;
        }
        return employee;
    }


    //删除员工
    public void deleteEmployee(Integer id){
        employees.remove(id);
    }





}
