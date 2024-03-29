package com.cg.go.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.go.entity.Customer;
//class provides the mechanism for storage, retrieval, search, update and delete operation on objects

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
