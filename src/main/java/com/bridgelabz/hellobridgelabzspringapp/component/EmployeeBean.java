package com.bridgelabz.hellobridgelabzspringapp.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Purpose : Details of EmployeeBean
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@Component
public class EmployeeBean {
    private String ename;
    private int eid;

    @Autowired
    private DepartmentBean departmentBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean(){}

    /**
     * Purpose : This method is used to access the object dependency connection of the employee of particular department
     *
     * @param departmentBean defines the name of the department in which the employee is belonging
     */
    @Autowired
    public EmployeeBean(DepartmentBean departmentBean){
        this.departmentBean = departmentBean;
    }
    /**
     * Purpose : This method is used to get the employee id
     *
     * @return the id of the employee
     */
    public int getEid() {
        return eid;
    }
    /**
     * Purpose : This method is used to set the employee id
     *
     * @return the id of the employee
     */
    public void setEid(int eid) {
        this.eid = eid;
    }
    /**
     * Purpose : This method is used to get the name of the employee
     *
     * @return the employee name
     */
    public String getEname() {
        return ename;
    }
    /**
     * Purpose : This method is used to set the name of the employee
     *
     * @return the employee name
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * Purpose : This method is used to access the DepartmentBean to get the name of the department
     *
     * @return the name of the department
     */
    public  DepartmentBean getDepartmentBean(){
        return departmentBean;
    }
    /**
     * Purpose : This method is used to set the name of the department
     *
     * @param departmentBean defines the name of the department
     */
    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean){
        this.departmentBean = departmentBean;
    }
    /**
     * Purpose : This method is used to show all the details of the employee and also their corresponding department name
     *
     */
    public void showEmployeeDetails(){
        logger.debug("Employee Id : {}",eid);
        logger.debug("Employee Name : {}",ename);
        departmentBean.setDeptName("Backend Developer");
        logger.debug("Department : {}",departmentBean.getDeptName());
    }

}
