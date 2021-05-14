package com.example.fifth.employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.fifth.employee.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> getEmployee();

	Employee getEmployee(int id);

	List<Employee> addOneEmployee(Employee employee);

	List<Employee> updateOneEmployee(int id, Employee employee);

	List<Employee> deleteOneInventory(int id);

}
