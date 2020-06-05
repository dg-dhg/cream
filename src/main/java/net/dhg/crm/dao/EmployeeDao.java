package net.dhg.crm.dao;


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
        employees.put(1001,new Employee(1001,Employee.MALE,"li","630909931@qq.com",new Department("工信部",101),new Date(2013,8,12)));
        employees.put(1002,new Employee(1005,Employee.MALE,"hong","630909931@qq.com",new Department("友爱部",102),new Date(2012,1,12)));
        employees.put(1003,new Employee(1011,Employee.MALE,"liao","630909931@qq.com",new Department("技术部",103),new Date(2019,2,12)));
        employees.put(1004,new Employee(1056,Employee.MALE,"zhang","630909931@qq.com",new Department("人事部",104),new Date(2009,5,12)));

    }
    private static Integer initId=105;
    //新增员工
    public void save(Employee employee){
        //主键为空
        if(employee.getId()==null){
            employee.setId(initId++);
        }
       departmentDao.getDepartmentById(employee.getDepartment().getId());

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
    public void deleteEmployee(Integer id){
        employees.remove(id);
    }




}
