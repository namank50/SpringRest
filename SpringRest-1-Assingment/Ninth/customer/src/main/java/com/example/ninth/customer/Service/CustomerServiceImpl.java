package com.example.ninth.customer.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninth.customer.dao.CustomerDAO;
import com.example.ninth.customer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.findAll();
	}

	@Override
	public Customer getOneCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.findById(id).get();
	}

	@Override
	public List<Customer> addOneCustomer(Customer employee) {
		// TODO Auto-generated method stub
		customerDAO.save(employee);
		return customerDAO.findAll();
	}

	@Override
	public List<Customer> updateOneCustomer(int id, Customer employee) {
		// TODO Auto-generated method stub
		customerDAO.save(employee);
		return customerDAO.findAll();
	}

	@Override
	public List<Customer> deleteOneCustomer(int id) {
		// TODO Auto-generated method stub
		customerDAO.deleteById(id);
		return customerDAO.findAll();
	}

}
