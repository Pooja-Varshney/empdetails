package com.project.spring.boot.project.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spring.boot.project.EmployeeModel.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long > {

}
