package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
// Class to create a list of employees
public class EmployeeDAO {

    private static EmployeesStorage list = new EmployeesStorage();

    // This static block is executed before executing the main block
    static {
        // Creating a few employees and adding them to the list
        list.getEmployeeList().add(new Employee(1001, "Jacob", "Smith", "jakesmith@ufo.com", "9521231001"));
        list.getEmployeeList().add(new Employee(1002, "Samantha", "Smith", "samsmith@gmail.com", "9521231002"));
        list.getEmployeeList().add(new Employee(1003, "Sierra", "Madison", "smadison@uco.edu", "9521231003"));
        list.getEmployeeList().add(new Employee(1004, "Tiger", "Stone", "tigerstone@yahoo.com", "9521231004"));
        list.getEmployeeList().add(new Employee(1005, "Henry", "Lazzarra", "hls2565@facebook.com", "9521231005"));
    }

    // Method to return the list
    public EmployeesStorage getAllEmployeesStorage() {
        return list;
    }

    // Method to add an employee to the employees list
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}