package com.example.employee.repository;

import java.util.*;
import com.example.employee.model.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployeeList();

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(int employeeId);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
