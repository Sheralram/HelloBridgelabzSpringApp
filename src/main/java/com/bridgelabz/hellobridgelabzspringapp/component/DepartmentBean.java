package com.bridgelabz.hellobridgelabzspringapp.component;

import org.springframework.stereotype.Component;

/**
 * Purpose : Simulate Department Details
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@Component
public class DepartmentBean {

    private String deptName;
    /**
     * Purpose : This method is used to get the department name
     *
     * @return the name of the department
     */
    public String getDeptName() {
        return deptName;
    }
    /**
     * Purpose : This method is used to set the department name
     *
     * @param deptName defines the name of the department
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
