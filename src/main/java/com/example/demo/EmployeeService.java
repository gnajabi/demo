package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {

    // Save operation
    void createRecord(Employee employee);

    // Read operation
    ArrayList<Employee> getEmployeeRecords();

    Employee getEmployeeById(int empID);

    // Update operation
    void updateRecord(int empID, String name, int age);

    // Delete operation
    void deleteRecord(int empID);
}
