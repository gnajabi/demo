package com.example.demo;

import java.util.List;

public interface EmployeeService {

    // Save operation
    void createRecord(Employee employee);

    // Read operation
    List<Employee> getEmployeeRecords();

    Employee getEmployeeById(int empID);

    // Update operation
    Employee updateRecord(int empID);

    // Delete operation
    void deleteRecord(int empID);
}
