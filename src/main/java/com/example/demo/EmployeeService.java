package com.example.demo;

import java.util.ArrayList;

public interface EmployeeService {

    // Save operation
    void createRecord(Employee employee);

    // Read operation
    Iterable<Employee> getEmployeeRecords();

    Employee getEmployeeById(int empID);

    // Update operation
    Employee updateRecord(int empID);

    // Delete operation
    void deleteRecord(int empID);
}
