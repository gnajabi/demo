package com.example.demo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/api/v1/employee")
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(ServiceImpl service) {
        this.service = service;
    }

    @GetMapping(value = "/employee")
    public ArrayList getEmployeeRecords() {
        return (ArrayList) service.getEmployeeRecords();
    }

    @PostMapping(value = "/employee")
    public void createRecord(@RequestBody Employee employee) {
        service.createRecord(employee);
    }

    @GetMapping(value = "/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping(value = "/employee/{id}")
    public void updateEmployeeRecord(@PathVariable int id, @RequestBody Employee employee) {
        service.updateRecord(id, employee);
    }

    @DeleteMapping(value = "/employee/{id}")
    public void deleteEmployeeRecord(@PathVariable int id) {
        service.deleteRecord(id);
    }

}
