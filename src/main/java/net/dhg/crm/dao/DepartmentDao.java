package net.dhg.crm.dao;


import net.dhg.crm.entity.Department;
import net.dhg.crm.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*部门dao*/
@Repository
public class DepartmentDao {

    //初始化表(使用静态的代码块 和属性)
    private static Map<Integer, Department> departments = null;

    //初始化数据
    static {
        departments = new HashMap<>();
        departments.put(101,new Department("工信部",101));
        departments.put(105,new Department("友爱部",102));
        departments.put(102,new Department("技术部",103));
        departments.put(103,new Department("人事部",104));
    }
    //取数据表
    public  Collection<Department> getDepartment(){
        //return a collection view of values contains in the map;
        return departments.values();
    }

    //通过主键查找
    public  Department getDepartmentById(Integer id){
        return departments.get(id);
    }






}
