package com.example.ninth.customer.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ninth.customer.entity.Customer;

@Service
public interface CustomerService {

	List<Customer> getCustomer();

	Customer getOneCustomer(int id);

	List<Customer> addOneCustomer(Customer employee);

	List<Customer> updateOneCustomer(int id, Customer employee);

	List<Customer> deleteOneCustomer(int id);

}
