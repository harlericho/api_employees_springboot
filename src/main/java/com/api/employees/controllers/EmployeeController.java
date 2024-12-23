package com.api.employees.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.employees.models.EmployeeModel;
import com.api.employees.services.EmployeeService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  // Get all employees
  @GetMapping
	public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployeess();
  }
  // Get employee by id
  @GetMapping(path = "/{id}")
  public EmployeeModel getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
  }
  // Add employee
  @PostMapping
  public EmployeeModel addEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.addEmployee(employee);
  }
  // Update employee
  @PutMapping(path = "/{id}")
  public EmployeeModel updateEmployee(@RequestBody EmployeeModel employee, @PathVariable("id") Long id) {
        return employeeService.updateEmployee(employee, id);
  }
  // Delete employee
  @DeleteMapping(path = "/{id}")
  public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
  }
}
