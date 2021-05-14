package com.example.fifth.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fifth.employee.entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
