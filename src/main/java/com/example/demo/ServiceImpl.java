package com.example.demo;

import java.util.List;

public class ServiceImpl implements EmployeeService {

    private EmployeeRepository empRepo;

    @Override
    public void createRecord(Employee employee) {
        empRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployeeRecords() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int empID) {
        return empRepo.findById(empID).get();
    }

    @Override
    public Employee updateRecord(int empID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRecord(int empID) {
        empRepo.deleteById(empID);
    }

}
