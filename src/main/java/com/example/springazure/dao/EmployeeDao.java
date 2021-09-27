package com.example.springazure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.springazure.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	
	
}
