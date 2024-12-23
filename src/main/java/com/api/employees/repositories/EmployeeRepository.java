package com.api.employees.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.employees.models.EmployeeModel;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

  
}
