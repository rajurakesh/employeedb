
package com.example.employee.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.employee.service.EmployeeH2Service;
import com.example.employee.model.Employee;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeH2Service employeeService;

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PutMapping("employees/{employeeId}")
    public Employee updaEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

}
