package com.example.demo;

import java.util.ArrayList;

public interface EmployeeService {

    // Save operation
    void createRecord(Employee employee);

    // Read operation
    ArrayList<Employee> getEmployeeRecords();

    Employee getEmployeeById(int empID);

    // Update operation

    void updateRecord(int empID, Employee emp);

    // Delete operation
    void deleteRecord(int empID);
}
