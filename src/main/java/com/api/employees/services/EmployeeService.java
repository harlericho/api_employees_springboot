package com.api.employees.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.employees.models.EmployeeModel;
import com.api.employees.repositories.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  public List<EmployeeModel> getEmployeess() {
    return employeeRepository.findAll();
  }

  public EmployeeModel getEmployeeById(Long id) {
    return employeeRepository.findById(id).orElse(null);
  }


  public EmployeeModel addEmployee(EmployeeModel employee) {
    return employeeRepository.save(employee);
  }


  public EmployeeModel updateEmployee(EmployeeModel employee, Long id) {
    EmployeeModel existingEmployee = employeeRepository.findById(id).orElse(null);
    existingEmployee.setName(employee.getName());
    existingEmployee.setEmail(employee.getEmail());
    return employeeRepository.save(existingEmployee);
  }


  public void deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
  }
  
}
