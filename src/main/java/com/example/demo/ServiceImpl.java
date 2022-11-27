package com.example.demo;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public void createRecord(Employee employee) {
        empRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(int empID) {
        return empRepo.findById(empID).get();
    }

    @Override
    @Transactional
    public void updateRecord(int empID, Employee emp) {
        Employee employee = empRepo.findById(empID).get();
        employee.setName(emp.getName());
        employee.setAge(emp.getAge());
    }

    @Override
    public void deleteRecord(int empID) {
        empRepo.deleteById(empID);
    }

    @Override
    public ArrayList<Employee> getEmployeeRecords() {
        return (ArrayList<Employee>) empRepo.findAll();
    }
}
