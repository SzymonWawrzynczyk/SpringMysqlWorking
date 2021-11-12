package com.bezkoder.spring.datajpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findByName(String userName);
}
