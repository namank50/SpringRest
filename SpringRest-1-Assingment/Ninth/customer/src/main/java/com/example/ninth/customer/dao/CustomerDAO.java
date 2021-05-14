package com.example.ninth.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ninth.customer.entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
