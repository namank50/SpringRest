package com.example.fifth.employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fifth.employee.dao.EmployeeDAO;
import com.example.fifth.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(id).get();
	}

	@Override
	public List<Employee> addOneEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.save(employee);
		return employeeDAO.findAll();
	}

	@Override
	public List<Employee> updateOneEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.save(employee);
		return employeeDAO.findAll();
	}

	@Override
	public List<Employee> deleteOneInventory(int id) {
		// TODO Auto-generated method stub
		Employee e = employeeDAO.getById(id);
		employeeDAO.delete(e);
		;
		return employeeDAO.findAll();
	}

}
