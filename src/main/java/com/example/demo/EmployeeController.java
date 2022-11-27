package com.example.demo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ArrayList getEmployees() {
        return (ArrayList) service.getEmployeeRecords();
    }
    
    @PostMapping(value = "/employee")
    public void createRecord(@RequestBody Employee employee) {
        service.createRecord(employee);
    }
}
